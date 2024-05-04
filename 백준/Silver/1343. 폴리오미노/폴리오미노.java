import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(s, ".");
        StringTokenizer st2 = new StringTokenizer(s, "X");
        int index = 0;

        while(index <s.length()) {
            if(s.charAt(index) == '.') {
                String s2 = st2.nextToken();
                sb.append(s2);
                index += s2.length();
            } else {
                String s2 = st.nextToken();
                int length = s2.length();
                while(s2.length() >= 4) {
                    sb.append("AAAA");
                    s2 = s2.substring(4, s2.length());
                }
                while(s2.length() >= 2) {
                    sb.append("BB");
                    s2 = s2.substring(2, s2.length());
                }
                if(s2.length() == 1) {
                    System.out.println(-1);
                    return;
                }
                index += length;
            }
        }
        System.out.println(sb);
    }
}