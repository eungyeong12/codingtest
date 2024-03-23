/* 22212067 조은경 */
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

        while(st.hasMoreTokens()) { // list: 원본 데이터, set: 중복을 제거하고 오름차순으로 정렬된 데이터
            int x = Integer.valueOf(st.nextToken());
            list.add(x); 
            set.add(x); 
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) { // 좌표 X와 X보다 작은 수의 개수를 map에 저장 
            map.put((Integer) iterator.next(), count++); 
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {  // list에 저장된 데이터를 키 값으로 하여 map의 value를 찾아 StringBuilder에 추가
            int key = list.remove(0);
            sb.append(map.get(key)).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
