class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s1 = "";
        String s2 = "";
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                s2 += String.valueOf(num_list[i]);
            } else {
                s1 += String.valueOf(num_list[i]);
            }
        }
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}