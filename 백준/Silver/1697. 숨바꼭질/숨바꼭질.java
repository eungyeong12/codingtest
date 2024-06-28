import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] visit = new int[100001];
        Arrays.fill(visit, -1);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        visit[n] = 0;

        while(!queue.isEmpty()) {
            int i = queue.poll();
            if(i == k) {
                System.out.println(visit[i]);
                return;
            }

            if(i-1 >= 0 && i-1 < visit.length && visit[i-1] == -1) {
                visit[i-1] = visit[i]+1;
                queue.add(i-1);
            }

            if(i+1 >= 0 && i+1 < visit.length && visit[i+1] == -1) {
                visit[i+1] = visit[i]+1;
                queue.add(i+1);
            }

            if(i*2 >= 0 && i*2 < visit.length && visit[i*2] == -1) {
                visit[i*2] = visit[i]+1;
                queue.add(i*2);
            }
        }
    }
}
