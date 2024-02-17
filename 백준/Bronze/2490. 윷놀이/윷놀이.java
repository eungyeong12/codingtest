import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 도  A 0111
        // 개 B 0011
        // 걸 C 0001
        // 윳 D 0000
        // 모 E 1111
        int n0 = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                if(sc.nextInt() == 0)
                    n0++;
            }
            if(n0 == 0)
                System.out.println("E");
            else if(n0 == 1)
                System.out.println("A");
            else if(n0 == 2)
                System.out.println("B");
            else if(n0 == 3)
                System.out.println("C");
            else if(n0 == 4)
                System.out.println("D");
            n0 = 0;
        }
        sc.close();
    }
}