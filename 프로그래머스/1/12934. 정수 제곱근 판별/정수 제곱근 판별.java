class Solution {
    public long solution(long n) {
        int n2 = (int) Math.sqrt(n);
        if(Math.pow(n2, 2) == n)
            return (long) Math.pow(n2+1, 2);

        return -1;
    }
}