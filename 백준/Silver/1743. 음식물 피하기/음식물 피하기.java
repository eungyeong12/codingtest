import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        boolean[][] visit = new boolean[n][m];
        int maxArea = 0;

        for(int i=0; i<k; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            board[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 0 || visit[i][j])
                    continue;

                queue.add(new Pair(i, j));
                visit[i][j] = true;
                int area = 0;

                while(!queue.isEmpty()) {
                    Pair p = queue.poll();
                    area++;
                    for(int d=0; d<4; d++) {
                        int nx = p.x + dx[d];
                        int ny = p.y + dy[d];

                        if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                            continue;
                        if(board[nx][ny] == 1 && !visit[nx][ny]) {
                            visit[nx][ny] = true;
                            queue.add(new Pair(nx, ny));
                        }
                    }
                }

                if(maxArea < area)
                    maxArea = area;
            }
        }

        System.out.println(maxArea);
    }
}
