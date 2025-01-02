class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        if (a > b) {
            answer = a;
        } else {
            answer = b;
        }
        return answer;
    }
}