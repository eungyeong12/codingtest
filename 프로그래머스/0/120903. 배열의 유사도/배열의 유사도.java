import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> l1 = new ArrayList<>(Arrays.asList(s1));
        List<String> l2 = new ArrayList<>(Arrays.asList(s2));
        
        for (String s : l1) {
            if (l2.contains(s)) {
                answer += 1;
            }
        }
        return answer;
    }
}