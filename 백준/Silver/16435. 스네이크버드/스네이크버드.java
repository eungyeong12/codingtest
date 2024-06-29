import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] h = new int[n];
        s = br.readLine();
        st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(h);
        for(int i=0; i<n; i++) {
            if(l >= h[i])
                l++;
        }

        System.out.println(l);
    }
}
