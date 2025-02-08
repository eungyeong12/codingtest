import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n0 = 0;
        int n1 = 0;
        String s = br.readLine();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if ((i == 0 && c == '0') 
                || (i > 0 && s.charAt(i - 1) == '1' && c == '0'))
                n0++;
            else if ((i == 0 && c == '1') 
                || (i > 0 && s.charAt(i - 1) == '0' && c == '1'))
                n1++;
        }
        System.out.println(Math.min(n0, n1));
    }
}