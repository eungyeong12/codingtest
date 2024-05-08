import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] l = new int[n];
        int length = 0;
        int answer = 0;
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            l[i] = Integer.parseInt(st.nextToken());
            length += l[i];
        }
        Arrays.sort(l);

        for(int ll : l) {
            answer += ll * (length-ll);
            length -= ll;
        }

        System.out.println(answer);
    }
}
