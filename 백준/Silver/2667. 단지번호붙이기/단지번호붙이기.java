import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int count;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];
        String s;

        for(int i=0; i<n; i++) {
            s = br.readLine();
            for(int j=0; j<n; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        list = new ArrayList<>();
        count = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j]==1 && !visited[i][j]) {
                    count++;
                    dfs(i, j);
                    list.add(count);
                    count = 0;
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(int c : list) {
            System.out.println(c);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int k=0; k<4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n)
                continue;
            if(board[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
                count++;
            }
        }
    }
}
