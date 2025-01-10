class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        for (char c : s.toCharArray()) {
            int n = c - '0';
            answer += (char) (n + 97);
        }
        return answer;
    }
}