import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] charArray = my_string.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            answer += c;
        }
        return answer;
    }
}