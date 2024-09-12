import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        Set<String> set = new LinkedHashSet<>();
        for(int i=0; i<l; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                set.remove(s);
                set.add(s);
            } else {
                set.add(s);
            }
        }
        int i=0;
        for(String str : set) {
            if(i==k) break;
            System.out.println(str);
            i++;
        }
    }
}
