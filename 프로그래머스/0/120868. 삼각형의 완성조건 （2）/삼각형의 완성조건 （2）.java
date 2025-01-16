import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        // sides[0]이 가장 긴 변인 경우
        for (int i=1; i<=sides[1]; i++) {
            if (i + sides[0] > sides[1]) {
                answer++;
            }
        }
        // 나머지 한 변이 가장 긴 변인 경우 
        for (int i=sides[1] + 1; i< sides[0] + sides[1]; i++) {
            if (i < sides[0] + sides[1]) {
                answer++;
            }
        }
        return answer;
    }
}