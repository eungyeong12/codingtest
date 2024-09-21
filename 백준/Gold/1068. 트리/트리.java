import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static List<Integer>[] tree;
    static int[] parent;
    static boolean visited[];
    static int count;
    static int delete;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n];
        visited = new boolean[n+1];
        parent = new int[n];

        for(int i=0; i<n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        int root = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
            if(parent[i] == -1) {
                root = i; // 부모가 없다면 루트는 i
            } else {
                tree[parent[i]].add(i);
            }
        }

        delete = Integer.parseInt(br.readLine());

        if(delete == root) {
            System.out.println(0); // 루트 노드를 삭제하면 리프 노드는 0
        } else {
            dfs(root); // dfs를 통해 트리를 탐색하면서 리프 노드의 개수를 셈
            System.out.println(count);
        }
    }

    static void dfs(int node) {
        visited[node] = true;

        if(node == delete) return; // 삭제할 노드는 탐색x

        int cnt = 0;
        for(int child : tree[node]) {
            if(!visited[child] && child != delete) {
                cnt++;
                dfs(child);
            }
        }

        if(cnt == 0)
            count++;
    }
}
