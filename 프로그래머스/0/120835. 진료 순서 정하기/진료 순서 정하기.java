import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<emergency.length; i++) {
            map.put(emergency[i], i);
        }
        Arrays.sort(emergency);
        int seq = 1;
        for (int i=emergency.length-1; i>=0; i--) {
            answer[map.get(emergency[i])] = seq++;
        }
        return answer;
    }
}