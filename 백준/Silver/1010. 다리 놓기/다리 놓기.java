import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        StringTokenizer st;

        for(int i=0; i<t; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(combination(m, n));
        }
    }

    static int combination(int n, int r) {
        if(n == r || r == 0) return 1;
        if(r == 1) return n;

        r = Math.max(r, n-r);
        long result = 1;
        for(int i=0; i<r; i++) {
            result *= (n-i);
            result /= (i+1);
        }

        return (int) result;
    }
}
