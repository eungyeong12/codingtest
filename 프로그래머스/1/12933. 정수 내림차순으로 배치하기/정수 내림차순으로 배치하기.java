import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        Arrays.sort(c);

        for(int i=0; i<c.length; i++) 
            answer += (c[i]-'0') * Math.pow(10, i);
        
        return answer;
    }
}