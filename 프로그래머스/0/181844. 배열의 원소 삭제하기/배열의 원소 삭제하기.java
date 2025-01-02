import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int d : delete_list) {
            list.add(d);
        }
        List<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            if (!list.contains(a)) {
                answer.add(a);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}