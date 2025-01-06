import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (list.size() == k) break;
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        if (k > list.size()) {
            int n = k - list.size();
            for (int i=0; i<n; i++) {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}