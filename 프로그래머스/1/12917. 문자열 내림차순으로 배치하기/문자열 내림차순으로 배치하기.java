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
        return new StringBuilder(new String(c)).reverse().toString();
    }
}