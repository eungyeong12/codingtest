import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] board;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new int[n+1][n+1];
        visited = new boolean[n+1];
        int count = 0;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = board[y][x] = 1;
        }


        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int v) {
        visited[v] = true;

        for(int i=1; i<=n; i++) {
            if(board[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }
}
