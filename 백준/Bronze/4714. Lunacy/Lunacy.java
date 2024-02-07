import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double n = sc.nextDouble();
            if(n == -1.0) break;
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", n, n * 0.167);
        }
        sc.close();
    }
}