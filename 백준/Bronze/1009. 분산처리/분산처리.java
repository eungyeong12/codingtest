import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int answer = 1;
            for(int j=0; j<n2; j++) {
                answer *= n1;
                while(answer > 10)
                    answer %= 10;
            }
            if(answer == 0)
                System.out.println(10);
            else
                System.out.println(answer);
        }
        sc.close();
    }
}