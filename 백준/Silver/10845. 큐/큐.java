import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.offer(num);
                    break;
                case "pop":
                    if(queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.pop() + "\n");
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.peekFirst() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append(-1 + "\n");
                    else sb.append(queue.peekLast() + "\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
