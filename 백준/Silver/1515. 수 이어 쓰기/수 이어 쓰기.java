import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int index = 0;
        int n = 0;
        while (index < s.length()) {
            n++;
            String cur = String.valueOf(n);
            for (char c : cur.toCharArray()) {
                if (index < s.length() && c == s.charAt(index))
                    index++;
            }
        }
        System.out.println(n);
    }
}