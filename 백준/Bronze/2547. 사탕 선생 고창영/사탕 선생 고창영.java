import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            BigInteger count = new BigInteger("0");
            for(int j=0; j<n; j++) {
                count = count.add(sc.nextBigInteger());
            }
            if(count.remainder(BigInteger.valueOf(n)).equals(BigInteger.ZERO))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}