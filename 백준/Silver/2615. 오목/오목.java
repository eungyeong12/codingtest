import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N = 19;
    static int[][] board;
    static int[] dx = {0, -1, 1, 1}; // 우, 우상, 우하, 하
    static int[] dy = {1, 1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[N][N];
        String s;
        StringTokenizer st;

        for(int i=0; i<N; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(board[i][j] != 0) {
                    int current = board[i][j];
                    for(int d=0; d<4; d++) {
                        if(check(i, j, current, d)) {
                            System.out.println(current);
                            System.out.println((i+1) + " " + (j+1));
                            return;
                        }
                    }
                }
            }
        }

        System.out.println(0);
    }

    private static boolean check(int x, int y, int n, int d) {
        int count = 1;
        int nx, ny;

        for(int i=1; i<5; i++) {
            nx = x + i * dx[d];
            ny = y + i * dy[d];

            if (nx < 0 || nx >= N || ny < 0 || ny >= N || board[nx][ny] != n) {
                break;
            }
            count++;
        }

        if(count == 5) {
            // 육목 확인
            nx = x - dx[d];
            ny = y - dy[d];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == n) {
                return false;
            }

            nx = x + 5 * dx[d];
            ny = y + 5 * dy[d];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == n) {
                return false;
            }

            return true;
        }

        return false;
    }
}
