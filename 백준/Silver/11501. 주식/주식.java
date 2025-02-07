import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int[] arr;
        StringTokenizer st;
        int max;
        long sum;
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; t++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            sum = 0;
            max = arr[n-1];
            for (int i=n-2; i>=0; i--) {
                if (arr[i] < max)
                    sum += (max - arr[i]);
                else
                    max = arr[i];
            }
            System.out.println(sum);
        }
    }
}