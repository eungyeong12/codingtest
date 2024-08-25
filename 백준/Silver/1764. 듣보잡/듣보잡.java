import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        List<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }

        for(int i=0; i<m; i++) {
            String name = br.readLine();
            if(set.contains(name)) answer.add(name);
        }

        Collections.sort(answer);

        System.out.println(answer.size());
        for(String s : answer) {
            System.out.println(s);
        }
    }
}
