import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-8; i++) {
            for(int j=0; j<=m-8; j++) {
                count = 0;
                char c = 'W';
                for(int p=i; p<i+8; p++) {
                    for(int q=j; q<j+8; q++) {
                        if(board[p][q] != c)
                            count++;

                        c = c == 'W' ? 'B' : 'W';
                    }
                    c = c == 'W' ? 'B' : 'W';
                }
                count = Math.min(count, 64-count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
