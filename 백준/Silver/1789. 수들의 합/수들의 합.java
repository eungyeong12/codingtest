import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sum = 0;
        long count = 1;
        for(long i=1; i<=n; i++) {
            sum += i;
            if(sum > n) {
                count = i-1;
                break;
            }
        }

        System.out.println(count);
    }
}
