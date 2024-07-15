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
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
