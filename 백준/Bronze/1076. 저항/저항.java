import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("black", "0");
        map.put("brown", "1");
        map.put("red", "2");
        map.put("orange", "3");
        map.put("yellow", "4");
        map.put("green", "5");
        map.put("blue", "6");
        map.put("violet", "7");
        map.put("grey", "8");
        map.put("white", "9");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        String n1 = map.get(s1);
        String n2 = map.get(s2);
        int n = Integer.parseInt(n1+n2);
        BigInteger n3 = BigInteger.valueOf((long) Math.pow(10, Integer.parseInt(map.get(s3))));
        System.out.println(n3.multiply(BigInteger.valueOf(n)));
        sc.close();
    }
}