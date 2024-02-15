import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger code = sc.nextBigInteger();
        int k = sc.nextInt();

        for(int i=2; i<k; i++) {
            int p = i;
            BigInteger q = code.divide(BigInteger.valueOf(p));
            if(code.compareTo(BigInteger.valueOf(p).multiply(q)) == 0) {
                System.out.println("BAD " + p);
                sc.close();
                return;
            }
        }
        System.out.println("GOOD");
        sc.close();
    }
}