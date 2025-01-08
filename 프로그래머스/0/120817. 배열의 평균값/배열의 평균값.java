import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = Arrays.stream(numbers).sum();
        return sum / numbers.length;
    }
}