import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] board;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        board = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=m; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = board[y][x] = 1;
        }

        dfs(v);
        System.out.println();

        Arrays.fill(visited, false);
        bfs(v);
        System.out.println();
    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for(int i=1; i<=n; i++) {
            if(board[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    static void bfs(int v) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current + " ");

            for(int i=1; i<=n; i++) {
                if(board[current][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
