import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] s : clothes) {
            if(map.containsKey(s[1]))
                map.put(s[1], map.get(s[1])+1);
            else
                map.put(s[1], 1);
        }
        
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> me : set) {
            answer *= (me.getValue()+1);
        }


        return answer-1;
    }
}