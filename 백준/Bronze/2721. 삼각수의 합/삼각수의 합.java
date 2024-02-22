import java.util.*;

class Main {

    public static void main(String[] args) {

        // W(4) = Sum[k=1,2,3,4; k*T(k+1)]
        // T(2) + 2*T(3) + 3*T(4) + 4*T(5)
        // 3 + 12 + 30 + 60 = 105
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int j=1; j<=n; j++) {
                sum += j*T(j+1);
            }
            System.out.println(sum);
        }
        sc.close();
    }

    static int T(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
}