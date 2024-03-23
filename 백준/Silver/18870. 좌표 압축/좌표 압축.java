import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new TreeSet<>();

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        while(st.hasMoreTokens()) {
            int x = Integer.valueOf(st.nextToken());
            list.add(x);
            set.add(x);
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            map.put((Integer) iterator.next(), count++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++) {
            int key = list.remove(0);
            sb.append(map.get(key)).append(" ");
        }
        sb.append(map.get(list.get(0)));

        System.out.println(sb);
        br.close();
    }
}
