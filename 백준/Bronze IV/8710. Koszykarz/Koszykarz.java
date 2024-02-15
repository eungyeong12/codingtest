import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int h = 0;

        while(k<w) {
            k += m;
            h++;
        }

        System.out.println(h);
        sc.close();
    }
}