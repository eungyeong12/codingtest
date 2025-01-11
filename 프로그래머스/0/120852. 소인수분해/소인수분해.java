import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=2; i<=n; i++) {
            if (n % i == 0) {
                boolean b = true;
                for (int j=2; j<i; j++) {
                    if (i % j == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    list.add(i);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}