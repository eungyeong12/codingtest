class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prev = arr;
        int[] current;
        while (true) {
            current = new int[arr.length];
            for (int i=0; i<arr.length; i++) {
                int n = prev[i];
                if (n >= 50 && n % 2 == 0) {
                    current[i] = n % 2;
                } else if (n < 50 && n % 2 == 1) {
                    current[i] = n * 2 + 1;
                } else {
                    current[i] = n;
                }
            }
            answer++;
            boolean b = true;
            for (int i=0; i<arr.length; i++) {
                if (prev[i] != current[i]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                break;
            }
            prev = current;
        }
        return answer-1;
    }
}