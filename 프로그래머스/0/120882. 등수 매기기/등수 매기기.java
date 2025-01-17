import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        for (int i=0; i<score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        Set<Double> set = new HashSet<>();
        for (double a : avg) {
            set.add(a);
        }
        
        List<Double> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        int prev = -1;
        int grade = 1;
        for (double l : list) {
            for (int i=0; i<avg.length; i++) {
                if (l == avg[i]) {
                    if (prev != -1 && avg[prev] == avg[i]) {
                        answer[i] = answer[prev];
                    } else {
                        answer[i] = grade;
                    }
                    grade++;
                    prev = i;
                }
            }
        }
        return answer;
    }
}