import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        for(int i=0; i<t; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int y;
            int x;
            if(N%H == 0) {
                y = H;
                x = N / H;
            } else {
                y = N % H;
                x = (N / H) + 1;
            }

            if(x < 10)
                System.out.println(y + "0" + x);
            else
                System.out.println(y + "" + x);
        }
    }
}
