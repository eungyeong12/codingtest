import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int num = 1;
        int cnt = 1;
        while(num < n) {
            num += 6*cnt;
            cnt++;
            count++;
        }

        System.out.println(count);
    }
}
