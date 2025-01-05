import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Deque<Integer> stack = new ArrayDeque<>();
        int i= 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peekLast() != arr[i]) {
                stack.addLast(arr[i]);
            } else {
                stack.removeLast();
            }
            i++;
        }
        
        if (stack.isEmpty()) {
            stack.addFirst(-1);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}