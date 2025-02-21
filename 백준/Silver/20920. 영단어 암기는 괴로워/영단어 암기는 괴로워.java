import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> words = new HashMap<>();
        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if (s.length() < m) continue;
            if (words.isEmpty() || !words.containsKey(s)) {
                words.put(s, 1);
            } else {
                words.replace(s, words.get(s) + 1);
            }
        }
        
        List<String> list = new ArrayList<>(words.keySet());
        Collections.sort(list, (a, b) -> {
            if (words.get(a) != words.get(b))
                return words.get(b) - words.get(a); 
            if (a.length() != b.length())
                return b.length() - a.length(); 
            return a.compareTo(b); 
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}