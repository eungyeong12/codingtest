import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i=0; i<quiz.length; i++) {
            String q = quiz[i];
            StringTokenizer st = new StringTokenizer(q);
            int n1 = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int n2 = Integer.parseInt(st.nextToken());
            st.nextToken();
            int result = Integer.parseInt(st.nextToken());
            if (op.equals("+")) {
                if (n1 + n2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (n1 - n2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}