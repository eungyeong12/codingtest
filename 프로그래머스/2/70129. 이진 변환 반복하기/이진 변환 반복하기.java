import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int zero = 0;
        int count = 0;
        while(true) {
            int length = s.length();
            s = s.replace("0", "");
            int c = s.length();
            s = Integer.toBinaryString(c);
            zero += (length-c);
            count++;
            if(s.equals("1")) break;
        }
        
        answer = new int[2];
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}