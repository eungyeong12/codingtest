import java.util.*;

class Solution {
    public static String solution(String s) {
        StringBuilder st = new StringBuilder();

        st.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) == ' ')
                st.append(Character.toUpperCase(s.charAt(i)));
            else
                st.append(Character.toLowerCase(s.charAt(i)));
        }

        return st.toString();
    }
}