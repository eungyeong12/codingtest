import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 가장 큰 원판을 c로 옮기기 위해서는 n-1개의 원판이 A에서 B로 가야함 -> Hanoi(n-1)
        // A에 있는 가장 큰 원판이 C로 이동
        // B에 있는 (n-1)개의 원판을 C로 이동 -> Hanoi(n-1)
        // n개의 원판을 이동시키기 위한 공식 -> Hanoi(n) = 2 * Hanoi(n-1) + 1

        sb = new StringBuilder();
        int count = Hanoi(n, 1,2,3, 0);
        System.out.println(count);
        System.out.println(sb);
    }

    /**
     *
     * @param N :원판의 수
     * @param from : 출발지
     * @param temp : 중간지점
     * @param to : 목적지
     * @param count : 이동 횟수
     * @return
     */
    static int Hanoi(int N, int from, int temp, int to, int count) {

        count++; // 메서드가 실행될 때마다 1회 옮김

        if(N == 1) { // 이동할 원판의 수가 1개
            sb.append(from).append(" ").append(to).append("\n");
            return count;
        }

        // n-1개를 A에서 B로 이동
        count = Hanoi(N-1, from, to, temp, count);

        // 1개를 A에서 C로 이동
        sb.append(from).append(" ").append(to).append("\n");

        // N-1개를 B에서 C로 이동
        count = Hanoi(N-1, temp, from, to, count);

        return count;
    }
}
