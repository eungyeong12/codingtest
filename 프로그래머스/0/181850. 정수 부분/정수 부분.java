class Solution {
    public int solution(double flo) {
        int answer = 0;
        String s = String.valueOf(flo);
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '.') {
                s = s.substring(0, i);
                break;
            }
        }
        return Integer.parseInt(s);
    }
}