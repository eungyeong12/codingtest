class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for (int i=-10000000; i<=total; i++) {
            int n = 0;
            for (int j=0; j<num; j++) {
                n += i+j;
            }
            if (n == total) {
                for (int j=0; j<num; j++) {
                    answer[j] = i+j;
                }
                break;
            }
        }
        
        return answer;
    }
}