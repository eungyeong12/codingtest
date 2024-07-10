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

        ArrayDeque<Pair> stack = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 0 || visit[i][j]) // 그림이 그려져 있지 않거나, 이미 방문한 경우
                    continue;

                count++; // 그림의 개수 증가
                stack.push(new Pair(i, j)); // 시작하는 칸을 큐에 넣기
                visit[i][j] = true; // 방문 표시
                int area = 0;

                while(!stack.isEmpty()) { // 큐가 빌 때까지 반복
                    Pair p = stack.pop();
                    area++; // 그림의 넓이 증가
                    for(int k=0; k<4; k++) { // 상하좌우로 인접한 칸에 대해
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m) // 범위를 벗어나는 경우
                            continue;
                        if(board[nx][ny] == 1 && !visit[nx][ny]) { // 그림이 그려져 있고, 방문한 적이 없는 경우
                            visit[nx][ny] = true;
                            stack.push(new Pair(nx, ny));
                        }
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
