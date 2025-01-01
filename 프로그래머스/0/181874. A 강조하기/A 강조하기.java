class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'a' || myString.charAt(i) == 'A') {
                sb.append("A");
            } else {
                sb.append(Character.toLowerCase(myString.charAt(i)));
            }
        }
        return sb.toString();
    }
}