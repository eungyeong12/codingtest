import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<t; i++) {
            int student = Integer.parseInt(st.nextToken());
            if(map.containsKey(student))
                map.replace(student, map.get(student)+1);
            else
                map.put(student, 1);

            if(!list.contains(student)) {
                if(list.size() < n) {
                    list.add(student);
                } else {
                    int minIndex = 0;
                    for(int j=1; j<list.size(); j++) {
                        if(map.get(list.get(j)) < map.get(list.get(minIndex)))
                            minIndex = j;
                    }
                    map.replace(list.get(minIndex), 0);
                    list.remove(minIndex);
                    list.add(student);
                }
            }
        }

        Collections.sort(list);
        for(int num : list)
            System.out.print(num + " ");

    }
}
