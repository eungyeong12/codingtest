import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(getLCM(a, b));
        }
    }

    static int getLCM(int a, int b) { // 최소 공배수
        return a * b / getGCD(a, b);
    }

    static int getGCD(int a, int b) { // 최대 공약수
        if(b == 0)
            return a;
        return getGCD(b, a % b);
    }
}
