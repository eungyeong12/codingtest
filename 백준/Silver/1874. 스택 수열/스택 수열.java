import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(br.readLine());

            if(!stack.isEmpty() && stack.peek() == n) {
                stack.pop();
                sb.append("-\n");
            } else if(num <= n) {
                while(num <= n) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else if(!stack.isEmpty() && stack.peek() > n) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
