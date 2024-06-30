import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class pairComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.y == o2.y)
            return o1.x - o2.x;

        return o1.y - o2.y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Pair> list = new ArrayList<>();

        String s;
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            list.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, new pairComparator());

        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i).x + " " + list.get(i).y);
    }
}
