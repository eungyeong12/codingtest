import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Position {
    int x;
    int y;
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 보드의 크기
        int k = Integer.parseInt(br.readLine()); // 사과의 개수
        int[][] board = new int[n][n];

        String s;
        StringTokenizer st;

        for(int i=0; i<k; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = 1;
        }

        int l = Integer.parseInt(br.readLine()); // 방향 변환 횟수
        int[] t = new int[l]; // 시간
        String[] direction = new String[l]; // 회전 방향
        for(int i=0; i<l; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            t[i] = Integer.parseInt(st.nextToken());
            direction[i] = st.nextToken();
        }

        Deque<Position> snake = new LinkedList<>();
        snake.offer(new Position(0, 0));
        int time = 0;
        int[] dx = {0, 1, 0, -1}; // 오른쪽, 아래, 왼쪽, 위 (90도 방향)
        int[] dy = {1, 0, -1, 0};
        int d = 0;
        int index = 0;
        while(true) {
            time++;

            Position head = snake.peekFirst();
            int nx = head.x + dx[d];
            int ny = head.y + dy[d];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) break;
            for(Position p : snake) {
                if(p.x == nx && p.y == ny) {
                    System.out.println(time);
                    return;
                }
            }

            if(board[nx][ny] == 1) {
                board[nx][ny] = 0;
                snake.offerFirst(new Position(nx, ny));
            } else {
                snake.offerFirst(new Position(nx, ny));
                snake.pollLast(); // 꼬리 제거
            }

            if(index < l && time == t[index]) { // 방향 변환
                if(direction[index].equals("D")) {
                    // 왼쪽으로 회전
                    d += 1;
                    if(d == 4) d = 0;
                }
                if(direction[index].equals("L")) {
                    // 오른쪽으로 회전
                    d -= 1;
                    if(d == -1) d = 3;
                }
                index++;
            }
        }

        System.out.println(time);
    }
}
