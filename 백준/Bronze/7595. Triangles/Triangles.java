import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            for(int i=0; i<n; i++) {
                for(int j=0; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}