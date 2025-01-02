import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(my_string, " ");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list.toArray(String[]::new);
    }
}