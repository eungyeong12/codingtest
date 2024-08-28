import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int sum;
        int count = 0;
        for(int i=0; i<n; i++) {
            sum = arr[i];
            if (sum == m) {
                count++;
                continue;
            }
            for(int j=i+1; j<n; j++) {
                sum += arr[j];
                if(sum > m) break;
                if(sum == m) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
