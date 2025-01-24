import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int k;
    static int[] board;

    public static void bfs(int n) {
        Deque<Integer> queue = new ArrayDeque<>();
        board[n]++;
        queue.add(n);

        while (!queue.isEmpty()) {
            int p = queue.poll();
            if (p-1 >= 0 && p-1 < board.length && board[p-1] == -1) {
                board[p-1] = board[p] + 1;
                queue.add(p-1);
            }
            if (p+1 >= 0 && p+1 < board.length && board[p+1] == -1) {
                board[p+1] = board[p] + 1;
                queue.add(p+1);
            }
            if (2*p >= 0 && 2*p < board.length && board[2*p] == -1) {
                board[2*p] = board[p] + 1;
                queue.add(2*p);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[100001];
        Arrays.fill(board, -1);
        bfs(n);
        System.out.println(board[k]);
    }
}