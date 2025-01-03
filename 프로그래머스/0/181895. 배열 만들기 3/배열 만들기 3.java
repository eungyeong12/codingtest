import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int[] array : intervals) {
            int start = array[0];
            int end = array[1];
            for (int i=start; i<=end; i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}