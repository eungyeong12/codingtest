import java.util.*;

class Solution {
    public String solution(String s) {
        int[] a = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            a[i] = s.charAt(i);
        }
        Arrays.sort(a);
        char[] c = new char[s.length()];
        for (int i=0; i<c.length; i++) {
            c[i] = (char) a[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<c.length; i++) {
            sb.append(c[i]);
        }
        return sb.reverse().toString();
    }
}