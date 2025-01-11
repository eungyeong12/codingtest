import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string);
        answer = Integer.parseInt(st.nextToken());
        
        while(st.hasMoreTokens()) {
            String op = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            
            if (op.equals("+")) {
                answer += n;
            } else {
                answer -= n;
            }
        }
        
        return answer;
    }
}