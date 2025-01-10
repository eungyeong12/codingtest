class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = num + "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) - '0' == k) {
                return i + 1;
            }
        }
        return answer;
    }
}