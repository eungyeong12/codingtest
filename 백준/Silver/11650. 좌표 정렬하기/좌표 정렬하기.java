import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.x == o2.x) return o1.y - o2.y;
        return o1.x - o2.x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        StringTokenizer st;
        Pair[] p = new Pair[n];

        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            p[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(p, new MyComparator());

        for(int i=0; i<n; i++) {
            System.out.println(p[i].x + " " + p[i].y);
        }
    }
}
