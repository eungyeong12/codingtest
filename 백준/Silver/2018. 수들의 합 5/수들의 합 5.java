import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1; // 자기 자신 하나로 이루어진 경우의 수 미리 저장
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != n) { // end_index가 마지막 수를 가리키기 전까지
            if(sum == n) {
                count ++;
                end_index++;
                sum += end_index;
            } else if(sum > n) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}