class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int p=i; p<=j; p++) {
            String s = String.valueOf(p);
            for (int q=0; q<s.length(); q++) {
                if (s.charAt(q) - '0' == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}