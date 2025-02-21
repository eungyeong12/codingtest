import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        long total = Long.parseLong(br.readLine());
        Arrays.sort(arr);
        if (sum <= total) {
            System.out.println(arr[n-1]);
        } else {
            int left = 0;
            int right = arr[n-1];
            while (left <= right) {
                int mid = (left + right) / 2;
                long s = 0;
                for (int i=0; i<n; i++) {
                    s += Math.min(arr[i], mid);
                }
                if (s <= total) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            System.out.println(left-1);
        }
    }
}