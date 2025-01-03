import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c); 
        if (set.size() == 3) {
            return a + b + c;
        } else if (set.size() == 2) {
            return (a + b + c) * (a*a + b*b + c*c);
        } else if (set.size() == 1) {
            return 3 * a * 3 * (a * a) * 3 * (a * a * a);
        }
        return answer;
    }
}