class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int[] array : queries) {
            int s = array[0];
            int e = array[1];
            for(int i=s; i<=e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}