class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for (int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            String s = picture[i];
            int n = 0;
            for (int j=0; j<s.length(); j++) {
                for (int x=0; x<k; x++) {
                    sb.append(s.charAt(j));
                }
            }
            for (int j=0; j<k; j++) {
                answer[index++] = sb.toString();
            }
        }
        
        return answer;
    }
}