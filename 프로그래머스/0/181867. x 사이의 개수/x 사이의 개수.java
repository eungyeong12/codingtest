import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] str = myString.split("x", myString.length());
        answer = new int[str.length];
        for (int i=0; i<answer.length; i++) {
            answer[i] = str[i].length();
        }
        return answer;
    }
}