import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i % 6 == 0 || i == n)
                System.out.print(i + " Go! ");
            else
                System.out.print(i + " ");
        }
        sc.close();
    }
}
