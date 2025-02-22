import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        char[] c = s.toCharArray();
        boolean[] b = new boolean[c.length];
        int count = 0;
        for (int i=0; i<c.length; i++) {
            if (c[i] == 'P') {
                int start = Math.max(0, i - k);
                int end = Math.min(i + k, s.length() - 1);
                for (int j=start; j<=end; j++) {
                    if (!b[j] && c[j] == 'H') {
                        count++;
                        b[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}