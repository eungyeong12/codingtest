import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayDeque<Integer> deque = new ArrayDeque();
        for(int a : arr) {
            if(deque.isEmpty())
                deque.add(a);
            else if(deque.getLast() != a)
                deque.add(a);
        }

        int index = 0;
        answer = new int[deque.size()];
        while(!deque.isEmpty()) {
            answer[index++] = deque.pop();
        }
        return answer;
    }
}