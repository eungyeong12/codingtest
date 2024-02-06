import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++) {
            String str = sc.nextLine();
            System.out.printf("%d. %s\n", i, str);
        }
        sc.close();
    }
}