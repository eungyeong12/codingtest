import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        s = br.readLine();
        st = new StringTokenizer(s, " ");

        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] b = new int[m][k];
        for(int i=0; i<m; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            for(int j=0; j<k; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] c = new int[n][k];
        matrixmult(n, m, k, a, b, c);

        for(int i=0; i<c.length; i++) {
            int[] arr = c[i];
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixmult(int n, int m, int k, int[][] a, int[][] b, int[][] c) {
        for(int i=0; i<n; i++) { // a의 i번째 row
            for (int j = 0; j < k; j++) { // b의 j번째 col
                for (int x = 0; x < m; x++) { // m번 곱해야함
                    c[i][j] += a[i][x] * b[x][j];
                }
            }
        }
    }
}
