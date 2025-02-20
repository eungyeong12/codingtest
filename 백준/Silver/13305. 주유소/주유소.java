import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] distance = new int[n-1];
        long[] price = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n-1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }
        long sum = 0;
        for (int i=0; i<n-1; i++) {
            if (price[i] < price[i+1]) {
                price[i+1] = price[i];
            }
            sum += price[i] * distance[i];
        }
        System.out.println(sum);
    }
}