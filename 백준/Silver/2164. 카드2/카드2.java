import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        for (int i=1; i<=n; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            q.poll();
            if (q.size() == 1)
                break;
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}