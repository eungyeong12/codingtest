import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = new char[s.length()];
        c = s.toCharArray();

        Arrays.sort(c);

        for(int i=c.length-1; i>=0; i--) {
            System.out.print(c[i]);
        }
    }
}
