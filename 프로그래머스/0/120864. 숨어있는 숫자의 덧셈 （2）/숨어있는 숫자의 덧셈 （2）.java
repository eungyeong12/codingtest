class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "";
        for (char c : my_string.toCharArray()) {
            int n = c - '0';
            if (n >= 0 && n < 10) {
                s += String.valueOf(n);
            } else {
                if (!s.equals("")) {
                    answer += Integer.parseInt(s);
                    s = "";
                }
            }
        }
        
        if (!s.equals("")) {
               answer += Integer.parseInt(s);
               s = "";
        }
        return answer;
    }
}