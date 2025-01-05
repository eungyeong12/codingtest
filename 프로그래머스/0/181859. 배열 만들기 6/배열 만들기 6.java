import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        int i= 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else {
                stack.pop();
            }
            i++;
        }
        
        if (stack.isEmpty()) {
            stack.push(-1);
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}