import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dp = new int[n][10];
        for(int i=0; i<n; i++) {
            dp[i][0] = 1;
        }
        for(int j=0; j<10; j++) {
            dp[0][j] = 1;
        }

        if(n > 1) {
            for(int i=1; i<n; i++) {
                for(int j=1; j<10; j++) {
                    dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 10007;
                }
            }
        }

        int count = 0;
        for(int j=0; j<10; j++) {
            count += dp[n-1][j];
        }

        System.out.println(count % 10007);
    }
}
