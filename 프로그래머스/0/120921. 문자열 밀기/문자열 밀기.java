class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for (int i=0; i<=A.length(); i++) {
            if (A.equals(B)) break;
            char c = A.charAt(A.length()-1);
            A = c + A.substring(0, A.length()-1);
            answer++;
        }
        if (answer == A.length()+1) {
            answer = -1;
        }
        return answer;
    }
}