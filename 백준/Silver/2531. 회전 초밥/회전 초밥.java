import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] count = new int[d+1];
        int max = 0;
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<k; i++) {
            count[arr[i%n]]++;
        }
        for(int i=1; i<=d; i++) {
            if (count[i] != 0) {
                max++;
            }
        }
        if (count[c] == 0) max++;

        for (int i=1; i<n; i++) {
            count[arr[(i-1)%n]]--;
            count[arr[(i+k-1)%n]]++;
            int answer = 0;
            for(int j=1; j<=d; j++) {
                if (count[j] != 0) {
                    answer++;
                }
            }
            if (count[c] == 0) answer++;
            max = Math.max(max, answer);
        }

        System.out.println(max);
    }
}