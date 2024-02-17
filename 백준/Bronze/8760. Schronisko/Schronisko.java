import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int w = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(w*k/2);
        }
        sc.close();
    }
}