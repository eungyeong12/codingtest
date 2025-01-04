import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        List<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        answer = list.toArray(String[]::new);
        if (answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}