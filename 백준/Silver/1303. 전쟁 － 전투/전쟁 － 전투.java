import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];
        boolean[][] visit = new boolean[n][m];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        List<Integer> W = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        int w = 0;
        int b = 0;

        for(int i=0; i<n; i++) {
            s = br.readLine();
            for(int j=0; j<m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 'B' || visit[i][j])
                    continue;

                queue.add(new Pair(i, j));
                visit[i][j] = true;
                w = 0;

                while(!queue.isEmpty()) {
                    Pair p = queue.poll();
                    w++;
                    for(int k=0; k<4; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                            continue;
                        if(board[nx][ny] == 'W' && !visit[nx][ny]) {
                            visit[nx][ny] = true;
                            queue.add(new Pair(nx, ny));
                        }
                    }
                }
                W.add(w*w);
            }
        }

        queue = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(board[i][j] == 'W' || visit[i][j])
                    continue;

                queue.add(new Pair(i, j));
                visit[i][j] = true;
                b = 0;

                while(!queue.isEmpty()) {
                    Pair p = queue.poll();
                    b++;
                    for(int k=0; k<4; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                            continue;
                        if(board[nx][ny] == 'B' && !visit[nx][ny]) {
                            visit[nx][ny] = true;
                            queue.add(new Pair(nx, ny));
                        }
                    }
                }

                B.add(b*b);
            }
        }

        w = 0;
        b = 0;
        if(!W.isEmpty()) {
            for(int i=0; i<W.size(); i++)
                w += W.get(i);

        }

        if(!B.isEmpty()) {
            for(int i=0; i<B.size(); i++)
                b += B.get(i);
        }

        System.out.println(w + " " + b);
    }
}
