import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                continue;
            } else {
                if (list.get(list.size()-1) < arr[i]) {
                    list.add(arr[i]);
                    continue;
                } else {
                    list.remove(list.size()-1);
                    i--;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}