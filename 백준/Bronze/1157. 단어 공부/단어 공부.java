import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        int[] alpha = new int[26];
        for(int i=0; i<s.length(); i++) {
            alpha[s.charAt(i)-'A']++;
        }

        int max = 0;
        char ch = '?';
        for(int i=0; i<alpha.length; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                ch = (char) (i+65);
            } else if(alpha[i] == max)
                ch = '?';
        }

        System.out.println(ch);
    }
}
