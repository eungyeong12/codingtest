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
        boolean[][] visit = new boolean[n][m];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int count = 0; // 그림의 개수
        int maxArea = 0; // 가장 넓은 그림의 넓이

        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 0 || visit[i][j]) // 그림이 그려져 있지 않거나, 이미 방문한 경우
                    continue;

                count++;
                queue.add(new Pair(i, j));
                visit[i][j] = true;
                int area = 0;

                while(!queue.isEmpty()) {
                    Pair p = queue.poll();
                    area++;
                    for(int k=0; k<4; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) // 범위를 벗어나는 경우
                            continue;
                        if(visit[nx][ny] || board[nx][ny] == 0) // 이미 방문했거나, 그림이 그려져 있지 않은 경우
                            continue;
                        visit[nx][ny] = true;
                        queue.add(new Pair(nx, ny));
                    }
                }

                if(maxArea < area)
                    maxArea = area;
            }
        }
        System.out.println(count);
        System.out.println(maxArea);
    }
}
