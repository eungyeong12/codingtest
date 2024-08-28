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
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            if(s.length() < m) continue;
            if(map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) != map.get(o2))
                    return map.get(o2) - map.get(o1);
                if(o1.length() != o2.length())
                    return o2.length() - o1.length();
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s : list)
            sb.append(s + "\n");
        System.out.println(sb);
    }
}
