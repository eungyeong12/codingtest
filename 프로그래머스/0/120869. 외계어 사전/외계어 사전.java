class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2; 
        for (String d : dic) {
            boolean b = true;
            for (String s : spell) {
                if (!d.contains(s)) {
                    b = false;
                }
                d = d.replaceFirst(s, "");
            }
            if (d.equals("") && b) {
                return 1;
            }
        }
        return answer;
    }
}