import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 재료의 개수
        int m = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int i = 0; // arr[0] -> min
        int j = n-1; // arr[n-1] -> Max
        while(i<j) {
            if(arr[i]+arr[j] < m) i++;
            else if(arr[i]+arr[j] > m) j--;
            else {
                count++;
                i++; j--;
            }
        }
        System.out.println(count);
    }
}