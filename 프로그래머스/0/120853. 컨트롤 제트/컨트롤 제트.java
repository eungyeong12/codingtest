import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int prev = 0;
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.equals("Z")) {
                answer -= prev;
                prev = 0;
            } else {
                int n = Integer.parseInt(str);
                answer += n;
                prev = n;
            }
        }
        return answer;
    }
}