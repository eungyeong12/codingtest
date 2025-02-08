import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int count = 0;
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i=n-1; i>0; i--) {
            if (arr[i - 1] >= arr[i]) {
                count += (arr[i - 1] - arr[i] + 1);
                arr[i - 1] = arr[i] - 1;
            }
        }
        System.out.println(count);
    }
}