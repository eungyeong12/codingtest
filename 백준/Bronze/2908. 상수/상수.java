import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        int a = Integer.parseInt(String.valueOf(sb.reverse()));
        sb = new StringBuilder();
        sb.append(st.nextToken());
        int b = Integer.parseInt(String.valueOf(sb.reverse()));
        if(a<b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
