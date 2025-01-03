class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s; i++) {
            sb.append(my_string.charAt(i));
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i=s; i<=e; i++) {
            sb2.append(my_string.charAt(i));
        }
        sb.append(sb2.reverse());
        for (int i = e+1; i<my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}