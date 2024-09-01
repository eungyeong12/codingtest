import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(1, 0);
        System.out.println(sb);
    }

    static void dfs(int at, int depth) {
        if(depth == m) {
            for(int val : arr)
                sb.append(val + " ");
            sb.append("\n");
            return;
        }

        for(int i=at; i<=n; i++) {
            arr[depth] = i;
            dfs(i + 1,  depth + 1);
        }
    }
}
