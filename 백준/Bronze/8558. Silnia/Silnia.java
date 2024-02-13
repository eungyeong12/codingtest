import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1;
        if(n <= 1)
            System.out.println(answer);
        else {
            for(int i=2; i<=n; i++) {
                answer *= i;
            }
            String s = String.valueOf(answer);
            System.out.println(s.charAt(s.length()-1));
        }
        sc.close();
    }
}