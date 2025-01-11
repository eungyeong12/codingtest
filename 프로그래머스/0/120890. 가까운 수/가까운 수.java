import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = Math.abs(n - array[array.length-1]);
        int num = array[array.length-1];
        
        for (int a : array) {
            int sub = Math.abs(n - a);
            if (sub < answer) {
                answer = sub;
                num = a;
            } else if (sub == answer) {
                if (num > a) num = a;
            }
        }
        return num;
    }
}