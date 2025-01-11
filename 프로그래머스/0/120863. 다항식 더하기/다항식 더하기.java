import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int result1 = 0;
        int result2 = 0;
        StringTokenizer st = new StringTokenizer(polynomial);
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.contains("x")) {
                if (token.equals("x")) token = "1x";
                int n = Integer.parseInt(token.replace("x", ""));
                result1 += n;
            } else if (token.equals("+")) {
                continue;
            } else {
                int n = Integer.parseInt(token);
                result2 += n;
            }
        }
        
        if (result1 != 0) {
            answer += result1 + "x";
            if (answer.equals("1x")) {
                answer = "x";
            }
        } 
        if (result2 != 0) {
            if (!answer.equals("")) {
                answer += " + ";
            } 
            answer += result2 + "";
        }
        return answer;
    }
}