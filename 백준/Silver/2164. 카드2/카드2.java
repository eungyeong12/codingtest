import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1; i<=n; i++) {
            deque.push(i);
        }

        while(deque.size() != 1) {
            deque.pollLast();
            n = deque.pollLast();
            deque.push(n);
        }

        System.out.println(deque.poll());
    }
}
