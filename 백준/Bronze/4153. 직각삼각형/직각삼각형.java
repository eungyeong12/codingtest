import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int[] t = new int[3];
        while(true) {
            s = br.readLine();
            if(s.equals("0 0 0"))
                break;
            st = new StringTokenizer(s, " ");
            for(int i=0; i<3; i++)
                t[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(t);
            if(Math.pow(t[0], 2) + Math.pow(t[1], 2) == Math.pow(t[2], 2))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
