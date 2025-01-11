import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        List<Character> list = new ArrayList<>();
        for (char c : after.toCharArray()) {
            list.add(c);
        }
        for (char c : before.toCharArray()) {
            if (list.contains(c)) {
                list.remove(list.indexOf(c));
            } else {
                return 0;
            }
        }
        return answer;
    }
}