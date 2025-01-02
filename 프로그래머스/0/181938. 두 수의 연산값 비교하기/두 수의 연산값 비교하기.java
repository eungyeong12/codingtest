class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = String.valueOf(a) + String.valueOf(b);
        if (Integer.parseInt(s) < 2 * a * b) {
            answer = 2 * a * b;
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}