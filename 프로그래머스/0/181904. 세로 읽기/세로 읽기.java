class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i=0; i<my_string.length(); i+=m) {
            if (i+c-1 < my_string.length()) {
                answer += my_string.charAt(i+c-1);
            }
        }
        return answer;
    }
}