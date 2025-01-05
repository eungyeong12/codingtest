class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        StringBuilder sb;
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            sb = new StringBuilder(answer.substring(s, e+1));
            answer = answer.substring(0, s) + sb.reverse() + answer.substring(e+1, answer.length());
        }
        return answer;
    }
}