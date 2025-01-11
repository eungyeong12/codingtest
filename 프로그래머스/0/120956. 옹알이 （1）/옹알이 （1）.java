import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        set.add("aya");
        set.add("ye");
        set.add("woo");
        set.add("ma");
        for (String str : babbling) {
            for (String s : set) {
                str = str.replace(s, "-");
            }
            if (str.replace("-", "").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}