import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;
        int e = 1;
        int s = 1;
        int m = 1;
        while(true) {
            if(e == E && s == S && m == M) break;

            e++;
            if(e == 16) e = 1;
            s++;
            if(s == 29) s = 1;
            m++;
            if(m == 20) m = 1;
            year++;
        }

        System.out.println(year);
    }
}
