import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            if (!map.containsKey(s.length())) {
                map.put(s.length(), 1);
            } else {
                map.replace(s.length(), map.get(s.length()) + 1);
            }
        }
        
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }
}