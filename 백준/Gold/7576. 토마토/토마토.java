import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n;
    static int m;
    static int[][] board;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count;
    static int day;
    static Deque<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        count = 0;
        day = 0;
        queue = new ArrayDeque<>();
        int total = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] != -1) total++;
                if(board[i][j] == 1) {
                    count++;
                    queue.offer(new Pair(i, j));
                }
            }
        }

        if(count == total) { // 저장될 때부터 모든 토마토가 익어있는 상태
            System.out.println(0);
            return;
        }

        bfs();

        if(count != total) { // 토마토가 모두 익지는 못하는 상황
            System.out.println(-1);
            return;
        }

        System.out.println(day-1);
    }

    static void bfs() {
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            for(int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(board[nx][ny] == 0) {
                        count++;
                        board[nx][ny] = board[p.x][p.y] + 1; // 날짜 저장
                        if(board[nx][ny] > day)
                            day = board[nx][ny];
                        queue.offer(new Pair(nx, ny));
                    }
                }
            }
        }
    }
}
