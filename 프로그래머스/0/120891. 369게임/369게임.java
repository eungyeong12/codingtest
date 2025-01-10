class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        for (char c : s.toCharArray()) {
            int n = c - '0';
            if (n != 0 && n % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}