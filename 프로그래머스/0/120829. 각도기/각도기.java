class Solution {
    public int solution(int angle) {
        int answer = 4;
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } 
        return answer;
    }
}