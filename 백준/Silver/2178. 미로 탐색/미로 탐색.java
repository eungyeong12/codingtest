import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] dist = new int[n][m];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        for(int i=0; i<n; i++) {
            s = br.readLine();
            for(int j=0; j<m; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                dist[i][j] = -1; // -1로 초기화하면 visit 배열 사용하지 않아도 됨
            }
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(0,0));
        dist[0][0] = 0;

        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            for(int k=0; k<4; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(board[nx][ny] == 1 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[p.x][p.y]+1;
                    queue.add(new Pair(nx, ny));
                }
            }
        }

        System.out.println(dist[n-1][m-1]+1); // 문제의 특성상 거리+1이 정답
    }
}
