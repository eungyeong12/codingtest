class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        while (!(myString.length() == 0)) {
            if (myString.endsWith(pat)) {
                break;
            }
            myString = myString.substring(0, myString.length()-1);
        }
        return myString;
    }
}