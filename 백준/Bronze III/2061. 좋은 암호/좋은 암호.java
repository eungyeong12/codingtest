import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger k = sc.nextBigInteger();
        int l = sc.nextInt();
        for(int i=2; i<l; i++) {
            if(k.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
                System.out.println("BAD " + i);
                sc.close();
                return;
            }
        }
        System.out.println("GOOD");
        sc.close();
    }
}