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
        while(true) {
            if (isSort(arr))
                break;
            for (int i=n-1; i>0; i--) {
                if (arr[i] <= arr[i - 1]) {
                    arr[i - 1]--;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
    
    public static boolean isSort(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }
}