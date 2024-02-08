import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        for(int i=0; i<4; i++)
            t += sc.nextInt();

        int x = t / 60;
        int y = t % 60;

        System.out.println(x);
        System.out.println(y);

        sc.close();
    }
}