import javax.print.Doc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Document {
    int n;
    int importance;
    public Document(int n, int importance) {
        this.n = n;
        this.importance = importance;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 문서의 개수
            int m = Integer.parseInt(st.nextToken()); // 궁금한 문서
            Deque<Document> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int importance = Integer.parseInt(st.nextToken());
                queue.offer(new Document(j, importance));
            }

            int count = 0;
            while(!queue.isEmpty()) {
                Document current = queue.poll();
                boolean isMax = true;

                for(Document d : queue) {
                    if(d.n == current.n) continue;

                    if(d.importance > current.importance) {
                        queue.offer(current);
                        isMax = false;
                        break;
                    }
                }

                if(!isMax)
                    continue;

                count++;
                if(current.n == m)
                    break;
            }

            System.out.println(count);
        }
    }
}
