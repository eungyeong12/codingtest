import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int x = m;
        int h = 0;

        if (x+T > M)
            System.out.println(-1);
        else {
            while(N!=0) {
                h++;
                if(x+T <= M) {
                    N--;
                    x+=T;
                } else
                    if(x-R >= m)
                        x-=R;
                    else
                        x=m;
            }
            System.out.println(h);
        }
    }
}