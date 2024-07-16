import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) return;
        while(n > 1) {
            for(int i=2; i<=n; i++) {
                if((n%i==0) && f(i)) {
                    System.out.println(i);
                    n /= i;
                    break;
                }
            }
        }
    }

    static boolean f(int n) {
        if(n == 1) return false;
        for(int i=2; i<n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
