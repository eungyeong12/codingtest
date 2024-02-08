import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 방학
        int a = sc.nextInt(); // 국어
        int b = sc.nextInt(); // 수학
        int c = sc.nextInt(); // 국어 최대
        int d = sc.nextInt(); // 수학 최대
        int aDays;
        int bDays;

        if(a % c != 0)
            aDays = a / c + 1;
        else
            aDays = a / c;

        if(b % d != 0)
            bDays = b / d + 1;
        else
            bDays = b / d;

        if(aDays > bDays)
            System.out.println(l - aDays);
        else
            System.out.println(l - bDays);

        sc.close();
    }
}