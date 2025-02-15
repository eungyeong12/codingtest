import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] pos = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
        }
        int minLen = Math.max(pos[0], n - pos[m - 1]);
        int maxLen = minLen;
        for (int i = 1; i < m; i++) {
            maxLen = Math.max(maxLen, pos[i] - pos[i - 1]);
        }
        maxLen = (maxLen + 1) / 2;
        if (maxLen < minLen) {
            System.out.println(minLen);
        } else {
            System.out.println(maxLen);
        }
    }
}