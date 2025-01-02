import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                list.add(s);
            }
        }
        return list.toArray(String[]::new);
    }
}