import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double n = sc.nextDouble();
            if(n == 0) break;
            System.out.printf("%.2f\n", 1 + n + n*n + n*n*n + n*n*n*n);
        }
        sc.close();
    }
}