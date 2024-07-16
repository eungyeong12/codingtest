import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];
        for(int i=1; i<15; i++) {
            apt[0][i] = i;
        }
        for(int i=1; i<15; i++) {
            for(int j=1; j<15; j++) {
                apt[i][j] = sum(apt, i-1, j);
            }
        }

        for(int i=0; i<t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
    }

    static int sum(int[][] apt, int i, int j) {
        if(j==1) return apt[i][j];
        return apt[i][j] + sum(apt, i, --j);
    }
}
