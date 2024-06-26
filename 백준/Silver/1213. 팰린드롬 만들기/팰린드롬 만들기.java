import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.replace(s.charAt(i), count+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        int oddCount = 0;
        char c = ' ';
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                oddCount++;
                c = entry.getKey();
            }
        }

        if(oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        List<Character> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        StringBuilder sb = new StringBuilder();
        for(char key : keySet) {
            for(int j=0; j<map.get(key)/2; j++)
                sb.append(key);
        }

        StringBuilder sb2 = new StringBuilder(sb).reverse();

        if(oddCount == 1)
            sb.append(c);

        sb.append(sb2);
        System.out.println(sb);
    }
}
