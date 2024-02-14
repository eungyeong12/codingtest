import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int answer = 1;
            if(n==0) break;
            for(int i=0; i<n; i++) {
                answer *= sc.nextInt();
                answer -= sc.nextInt();
            }
            System.out.println(answer);
        }
        sc.close();
    }
}