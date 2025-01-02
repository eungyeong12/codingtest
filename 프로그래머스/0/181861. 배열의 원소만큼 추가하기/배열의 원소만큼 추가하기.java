import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            for (int i=0; i<a; i++) {
                list.add(a);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}