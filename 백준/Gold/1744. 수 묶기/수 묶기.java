import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int i;
        int sum = 0;
        for(int j=0; j<n; j++) {
            arr[j] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (i=n-1; i>=0; i--) {
            if (arr[i] <= 0)
                break;
            if (i > 0 && arr[i] > 0 && arr[i - 1] > 0
                    && (arr[i] * arr[i - 1] >= arr[i] + arr[i - 1])) {
                sum += (arr[i] * arr[i - 1]);
                i--;
            } else {
                sum += arr[i];
            }
        }
        for (int j = 0; j <= i; j++) {
            if (j < i) {
                sum += (arr[j] * arr[j + 1]);
                j++;
            } else {
                sum += arr[j];
            }
        }
        System.out.println(sum);
    }
}