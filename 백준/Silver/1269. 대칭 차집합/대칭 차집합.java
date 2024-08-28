import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n1; i++)
            a.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n2; i++)
            b.add(Integer.parseInt(st.nextToken()));

        int count = 0;
        for(int n : a) {
            if(!b.contains(n))
                count++;
        }
        for(int n : b) {
            if(!a.contains(n))
                count++;
        }

        System.out.println(count);
    }
}
