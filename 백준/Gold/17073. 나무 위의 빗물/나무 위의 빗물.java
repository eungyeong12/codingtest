import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        tree = new ArrayList[n+1];
        for(int i=1; i<=n; i++)
            tree[i] = new ArrayList<>();

        for(int i=0; i<n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }

        // leaf node에만 물이 존재할 것이기 때문에 처음 물의 양/leaf node의 수를 구한다. 
        int leaf = 0; 
        for(int i=2; i<=n; i++) {
            if(tree[i].size() == 1) leaf++;
        }
        System.out.printf("%.10f", (double)w/leaf);
    }
}
