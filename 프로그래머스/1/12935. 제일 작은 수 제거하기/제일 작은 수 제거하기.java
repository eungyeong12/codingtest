import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        
        if (list.isEmpty()) {
            list.add(-1);
        } 
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}