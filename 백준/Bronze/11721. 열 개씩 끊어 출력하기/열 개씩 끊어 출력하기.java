import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(true) {
            if(sb.toString().length() > 10) {
                System.out.println(sb.toString().substring(0, 10));
                sb.delete(0, 10);
            } else {
                System.out.println(sb);
                break;
            }

        }
    }
}
