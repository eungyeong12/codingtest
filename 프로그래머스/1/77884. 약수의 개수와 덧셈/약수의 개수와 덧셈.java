class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            if (isEven(i)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public boolean isEven(int n) {
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        
        if (cnt % 2 == 0) return true;
        return false;
    }
}