import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(k*n-m < 0) System.out.println(0);
        else System.out.println(k*n-m);
    }
}