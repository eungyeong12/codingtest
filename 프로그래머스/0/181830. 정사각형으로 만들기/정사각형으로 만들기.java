class Solution {
    public int[][] solution(int[][] arr) {
        int n = 0;
        if (arr.length < arr[0].length) {
            n = arr[0].length;
        } else {
            n = arr.length;
        }
        int[][] answer = new int[n][n];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}