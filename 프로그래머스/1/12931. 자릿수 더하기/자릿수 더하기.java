import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            answer += Integer.valueOf(s.charAt(i))-'0';
        }
        return answer;
    }
}