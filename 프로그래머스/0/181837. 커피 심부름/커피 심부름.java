class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.equals("icecafelatte") || s.equals("cafelatteice")
                || s.equals("hotcafelatte") || s.equals("cafelattehot") || s.equals("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}