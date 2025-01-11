import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (list.contains(c)) {
                list.remove(list.indexOf(c));
                list2.add(c);
            } else {
                if (!list2.contains(c))
                    list.add(c);
            }
        }
        Collections.sort(list);
        for (char c : list) {
            answer += c;
        }
        return answer;
    }
}