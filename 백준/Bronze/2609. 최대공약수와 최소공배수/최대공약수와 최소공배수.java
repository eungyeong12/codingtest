import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(gcd(a, b)); // 최대공약수
        System.out.println(lcm(a, b)); // 최소공배수
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
