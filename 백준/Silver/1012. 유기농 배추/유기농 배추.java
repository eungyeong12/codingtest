import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int m;
    static int n;
    static int[][] board;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        StringTokenizer st;

        for(int i=0; i<t; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            board = new int[m][n];
            visited = new boolean[m][n];
            count = 0;

            for(int j=0; j<k; j++) {
                s = br.readLine();
                st = new StringTokenizer(s, " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }

            for(int j=0; j<m; j++) {
                for(int p=0; p<n; p++) {
                    if(board[j][p] == 1 && !visited[j][p]) {
                        dfs(j, p);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if(board[nx][ny] == 1 && !visited[nx][ny])
                    dfs(nx, ny);
            }
        }
    }
}
