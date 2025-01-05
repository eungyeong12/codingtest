import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        BigInteger n = n1.add(n2);
        return n.toString();
    }
}