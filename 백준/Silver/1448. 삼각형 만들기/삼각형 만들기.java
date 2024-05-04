import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        boolean b = false;

        for(int i=N; i>2; i--) {
            if(arr[i-3] + arr[i-2] > arr[i-1]) {
                System.out.println(arr[i - 3] + arr[i - 2] + arr[i-1]);
                b = true;
                break;
            }
        }

        if(!b)
            System.out.println(-1);
    }
}