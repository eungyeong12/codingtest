import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int m;
    static int[][] board;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void bfs(int x, int y) {
        Deque<int[]> queue = new ArrayDeque<>();
        visited[x][y]++;
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            int px = p[0];
            int py = p[1];

            for (int i=0; i<4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (visited[nx][ny] == 0 && board[nx][ny] == 1) {
                        visited[nx][ny] = visited[px][py] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new int[n][m];

        for (int i=0; i<n; i++) {
            String s = br.readLine();
            for (int j=0; j<m; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(visited[n-1][m-1]);
    }
}