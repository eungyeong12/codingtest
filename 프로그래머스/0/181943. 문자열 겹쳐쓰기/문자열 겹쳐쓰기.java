class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int newStringLength = overwrite_string.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        sb.append(overwrite_string);
        
        if (s + newStringLength < my_string.length()) {
            for (int i= s + newStringLength; i<my_string.length(); i++) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}