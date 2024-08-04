import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int MAX = 19;
    static int[][] board = new int[MAX+2][MAX+2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;

        for(int i=1; i<=MAX; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=1; j<=MAX; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=MAX; i++) {
            for(int j=1; j<=MAX; j++) {
                if(board[i][j] != 0) {
                    if(board[i][j-1] != board[i][j] && search1(board[i][j], i, j) == 1) {
                        System.out.println(board[i][j]);
                        System.out.println(i + " " + j);
                        return;
                    }
                    if(board[i-1][j-1] != board[i][j] && search2(board[i][j], i, j) == 1) {
                        System.out.println(board[i][j]);
                        System.out.println(i + " " + j);
                        return;
                    }
                    if(board[i-1][j] != board[i][j] && search3(board[i][j], i, j) == 1) {
                        System.out.println(board[i][j]);
                        System.out.println(i + " " + j);
                        return;
                    }
                    if(board[i+1][j-1] != board[i][j] && search4(board[i][j], i, j) == 1) {
                        System.out.println(board[i][j]);
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }

    static int search1(int color, int i, int j) {
        int cnt = 1;
        while (board[i][j+1] == color) {
            j++;
            cnt++;
        }
        return cnt == 5 && board[i][j+1] != color ? 1 : 0;
    }

    static int search2(int color, int i, int j) {
        int cnt = 1;
        while (board[i+1][j+1] == color) {
            i++;
            j++;
            cnt++;
        }
        return cnt == 5 && board[i+1][j+1] != color ? 1 : 0;
    }

    static int search3(int color, int i, int j) {
        int cnt = 1;
        while (board[i+1][j] == color) {
            i++;
            cnt++;
        }
        return cnt == 5 && board[i+1][j] != color ? 1 : 0;
    }

    static int search4(int color, int i, int j) {
        int cnt = 1;
        while (board[i-1][j+1] == color) {
            i--;
            j++;
            cnt++;
        }
        return cnt == 5 && board[i-1][j+1] != color ? 1 : 0;
    }
}
