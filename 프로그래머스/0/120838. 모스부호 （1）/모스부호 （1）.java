import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        for (int i=0; i<s.length; i++) {
            map.put(s[i], (char) (i + 97));
        }
        StringTokenizer st = new StringTokenizer(letter);
        while (st.hasMoreTokens()) {
            answer += map.get(st.nextToken());
        }
        return answer;
    }
}