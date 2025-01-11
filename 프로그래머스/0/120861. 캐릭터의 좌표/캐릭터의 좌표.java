class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int r = board[0] / 2;
        int c = board[1] / 2;
        
        for (String key : keyinput) {
            if (key.equals("up")) {
                if (answer[1]+1 <= c) {
                    answer[1]++;
                }
            } else if (key.equals("down")) {
                if (answer[1]-1 >= -c) {
                    answer[1]--;
                }
            } else if (key.equals("left")) {
                if (answer[0]-1 >= -r) {
                    answer[0]--;
                }
            } else if (key.equals("right")) {
                if (answer[0]+1 <= r) {
                    answer[0]++;
                }
            }
        }
        
        return answer;
    }
}