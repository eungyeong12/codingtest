import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String name = br.readLine();
            if(map.containsKey(name))
                map.replace(name, map.get(name)+1);
            else
                map.put(name, 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) != map.get(o2))
                    return map.get(o2) - map.get(o1);
                return o1.compareTo(o2);
            }
        });

        System.out.println(list.get(0));
    }
}
