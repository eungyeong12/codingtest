import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int endTime = h*60 + m +t;

        System.out.println(endTime/60%24 + " " + endTime%60);
        sc.close();
    }
}