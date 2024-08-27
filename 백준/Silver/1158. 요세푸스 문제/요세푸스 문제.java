import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=n; i++)
            deque.addLast(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(deque.size() > 1) {
            for(int i=1; i<k; i++)
                deque.addLast(deque.pollFirst());
            sb.append(deque.pollFirst() + ", ");
        }
        sb.append(deque.poll() + ">");
        System.out.println(sb);
    }
}
