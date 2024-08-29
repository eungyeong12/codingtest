import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++)
            graph[i] = new ArrayList<>();
        visited = new boolean[n+1];
        parent = new int[n+1];
        for(int i=1; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);

        for(int i=2; i<=n; i++)
            System.out.println(parent[i]);
    }

    static void dfs(int v) {
        visited[v] = true;
        for(int i : graph[v]) {
            if(!visited[i]) {
                parent[i] = v;
                dfs(i);
            }
        }
    }
}
