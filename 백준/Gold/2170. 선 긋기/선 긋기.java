import java.util.*;
import java.io.*;

class Line {
    int s;
    int e;
    
    Line(int s, int e) {
        this.s = s;
        this.e = e;
    }
}
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Line> list = new ArrayList<>();
        List<Line> visited = new ArrayList<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Line(x, y));
        }
        Collections.sort(list, (a, b) -> (a.s - b.s));
        visited.add(new Line(list.get(0).s, list.get(0).e));
        int j = 0;
        for (int i=1; i<n; i++) {
            Line l = visited.get(j);
            Line l2 = list.get(i);
            if (l2.s >= l.s && l2.s <= l.e && l2.e > l.e) {
                l.e = l2.e;
            } else if (l2.s > l.e) {
                visited.add(new Line(l2.s, l2.e));
                j++;
            }
        }
        int len = 0;
        for (int i=0; i<visited.size(); i++) {
            len += (visited.get(i).e - visited.get(i).s);
        }
        System.out.println(len);
    }
}