import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(alpha[ch-'a'] == -1)
                alpha[ch-'a'] = i;
        }

        for(int i=0; i<alpha.length; i++)
            System.out.print(alpha[i] + " ");
    }
}
