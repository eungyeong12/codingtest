import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n0 = 0;
        int n1 = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0')
                n0++;
            else
                n1++;
        }
        for (int i=0; i<n0/2; i++) {
            sb.append('0');
        }
        for (int i=0; i<n1/2; i++) {
            sb.append('1');
        }
        System.out.println(sb);
    }
}