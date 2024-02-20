import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++) {
            int min = A[i];
            int max = B[B.length-1-i];
            sum += min*max;
        }

        return sum;
    }
}