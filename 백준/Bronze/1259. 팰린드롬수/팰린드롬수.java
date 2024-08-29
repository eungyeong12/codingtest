import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            if(s.equals("0")) break;
            StringBuilder s1 = new StringBuilder(s.substring(0, s.length()/2));
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            if(s.length()%2 == 1)
                sb.append(s.charAt(s.length()/2));
            sb.append(s1.reverse());
            if(sb.toString().equals(s))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
