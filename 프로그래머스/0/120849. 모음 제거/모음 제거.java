class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = "aeiou";
        for (char c : my_string.toCharArray()) {
            if (!s.contains(String.valueOf(c))) {
                answer += c;
            }
        }
        return answer;
    }
}