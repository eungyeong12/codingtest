class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = "";
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                s += "B";
            } else if (myString.charAt(i) == 'B') {
                s += "A";
            }
        }
        if (s.contains(pat)) {
            return 1;
        }
        return answer;
    }
}