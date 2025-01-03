class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        boolean b = true;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    b = false;
                }
            }
        }
        
        if (b) {
            return 1;
        }
        return answer;
    }
}