class Solution {
    public int solution(int n) {
        int count = 1;
        while(true) {
            if ((count * 6) % n == 0) {
                break;
            }
            count++;
        }
        return count;
    }
}