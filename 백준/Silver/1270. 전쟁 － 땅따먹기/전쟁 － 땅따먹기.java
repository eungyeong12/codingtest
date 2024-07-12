import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        boolean answer = false;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int t = Integer.parseInt(st.nextToken());
            for(int j=0; j<t; j++) {
                long tN = Long.parseLong(st.nextToken());
                if(map.containsKey(tN)) {
                    map.replace(tN, map.get(tN)+1);
                } else {
                    map.put(tN, 1);
                }
            }

            for(Map.Entry<Long, Integer> entry : map.entrySet()) {
                if(entry.getValue() > (t/2)) {
                    System.out.println(entry.getKey());
                    answer = true;
                }
            }

            if(!answer) {
                System.out.println("SYJKGW");
            }

            map.clear();
            answer = false;
        }
    }
}
