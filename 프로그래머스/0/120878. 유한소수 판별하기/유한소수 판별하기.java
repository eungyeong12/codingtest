class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for (int i=2; i<=Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        for (int i=3; i<=b; i+=2) {
            if (i % 5 == 0) continue;
            if (b % i == 0) {
                return 2;
            }
        }
        return answer;
    }
}