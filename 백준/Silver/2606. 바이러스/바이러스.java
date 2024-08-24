import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] board;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        board = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = board[y][x] = 1;
        }

        dfs(1);
        System.out.println(count-1);

    }

    static void dfs(int v) {
        visited[v] = true;
        count++;

        for(int i=1; i<=n; i++) {
            if(board[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }
}
