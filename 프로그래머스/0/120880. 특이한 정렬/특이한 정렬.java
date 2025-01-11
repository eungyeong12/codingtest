import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }
        Collections.sort(list, (a, b) -> {
            int n1 = Math.abs(a - n);
            int n2 = Math.abs(b - n);
            if (n1 == n2) return b - a;
            else return n1 - n2;
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}