import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = Integer.parseInt(N, B);
        System.out.println(answer);
    }
}