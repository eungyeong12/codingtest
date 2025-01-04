import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
       
        int start = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        if (start == -1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int end = start;
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        answer = new int[end-start+1];
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i+start];
        }
        return answer;
    }
}