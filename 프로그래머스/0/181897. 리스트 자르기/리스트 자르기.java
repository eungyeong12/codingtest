import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = 0;
        int b = 0;
        int c = 1;
        
        if (n == 1) {
            b = slicer[1];
        } else if (n == 2) {
            a = slicer[0];
            b = num_list.length-1;
        } else if (n == 3) {
            a = slicer[0];
            b = slicer[1];
        } else if (n == 4) {
            a = slicer[0];
            b = slicer[1];
            c = slicer[2];
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i=a; i<=b; i+=c) {
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}