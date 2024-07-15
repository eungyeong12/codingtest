import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m >= 45)
            System.out.println(h + " " + (m-45));
        else {
            if(h-1 < 0)
                h = 23;
            else
                h -= 1;
            m = 60-(45-m);
            System.out.println(h + " " + m);
        }
    }
}
