import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=l; i<=r; i++) {
            if (i % 5 == 0) {
                String s = String.valueOf(i);
                s = s.replaceAll("5", "");
                s = s.replaceAll("0", "");
                if (s.equals("")) {
                    list.add(i);
                }
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}