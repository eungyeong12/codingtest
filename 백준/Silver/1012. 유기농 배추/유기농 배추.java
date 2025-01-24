import java.util.*;
import java.io.*;

class Main {
    static int m;
    static int n; 
    static int k;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;
    
    public static void bfs(int x, int y) {
        Deque<int[]> queue = new ArrayDeque<>();
        visited[x][y] = true;
        queue.add(new int[]{x, y});
        
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            int px = p[0];
            int py = p[1];
            
            for (int i=0; i<4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (!visited[nx][ny] && board[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            board = new int[m][n];
            visited = new boolean[m][n];
            count = 0;
            
            for (int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[x][y] = 1;
            }
            
            for (int x=0; x<m; x++) {
                for (int y=0; y<n; y++) {
                    if (!visited[x][y] && board[x][y] == 1) {
                        count++;
                        bfs(x, y);
                    }
                }
            }
            
            System.out.println(count);
        }
    }
}