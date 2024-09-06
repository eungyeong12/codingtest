import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int v;
    static ArrayList<Integer>[] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        visited = new int[n+1];
        for(int i=1; i<=n; i++)
            graph[i] = new ArrayList<>();
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        for(int i=1; i<=n; i++)
            Collections.sort(graph[i]);

        bfs(v);

        for(int i=1; i<=n; i++)
            System.out.println(visited[i]);
    }

    static void bfs(int v) {
        Deque<Integer> queue = new ArrayDeque<>();
        int cnt = 1;
        queue.offer(v);
        visited[v] = cnt++;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            for(int next : graph[current]) {
                if(visited[next] == 0) {
                    visited[next] = cnt++;
                    queue.add(next);
                }
            }
        }
    }
}
