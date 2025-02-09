import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        Queue<Long> q = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            q.add(arr[i]);
        }

        for (int i=0; i<m; i++) {
            long a = q.poll();
            long b = q.poll();
            long sum = a + b;
            q.add(sum);
            q.add(sum);
        }

        long sum = 0;
        while (!q.isEmpty()) {
            sum += q.poll();
        }
        System.out.println(sum);
    }
}