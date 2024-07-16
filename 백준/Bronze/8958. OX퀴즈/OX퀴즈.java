import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        int count = 0;
        int score = 0;
        for(int i=0; i<t; i++) {
            s = br.readLine();
            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if(c == 'O')
                    score += ++count;
                else
                    count = 0;
            }
            System.out.println(score);
            count = 0;
            score = 0;
        }
    }
}
