import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        list.add(64);
        list.add(128);
        list.add(256);
        list.add(512);
        list.add(1024);
        
        if (!list.contains(arr.length)) {
            for (int i : list) {
                if (arr.length < i) {
                    answer = new int[i];
                    break;
                }
            }
        } else {
            return arr;
        }
        
        for (int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}