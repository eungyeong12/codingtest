class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i=1; i<=Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        int i = Math.min(n, m);
        while (true) {
            if (i % n == 0 && i % m == 0) {
                answer[1] = i;
                break;
            }
            i++;
        }
        return answer;
    }
}