import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st =  new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<m; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int num = Integer.parseInt(st.nextToken());
            for(int j=start; j<=end; j++)
                arr[j] = num;
        }
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
}
