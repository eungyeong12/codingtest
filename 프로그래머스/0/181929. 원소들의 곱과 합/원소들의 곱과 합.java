class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for (int n : num_list) {
            mul *= n;
            sum += n;
        }
        sum *= sum;
        System.out.println(mul);
        System.out.println(sum);
        if (mul < sum) {
            answer = 1;
        }
        return answer;
    }
}