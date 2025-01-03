import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(myString, "x");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        
        Collections.sort(list);
        return list.toArray(String[]::new);
    }
}