import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c - '0' >= 0 && c - '0' < 10) {
                list.add(c - '0');
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}