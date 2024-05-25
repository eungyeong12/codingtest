class Solution {
    public int solution(int[][] triangle) {
        for(int n=1; n<triangle.length; n++) {
            for(int i=0; i<triangle[n].length; i++) {
                if(i==0)
                    triangle[n][i] += triangle[n-1][i];
                else if(i==triangle[n].length-1)
                    triangle[n][i] += triangle[n-1][i-1];
                else
                    triangle[n][i] += Math.max(triangle[n-1][i-1], triangle[n-1][i]);
            }
        }

        int max = 0;
        for(int n : triangle[triangle.length-1]) {
            if(n > max)
                max = n;
        }
        return max;
    }
}