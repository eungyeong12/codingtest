import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=n; i++) {
            deque.add(i);
        }

        s = br.readLine();
        st = new StringTokenizer(s, " ");
        int[] arr = new int[m];
        for(int i=0; i<m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i=0; i<m; i++) {
            int index = 0;

            for(int num : deque) {
                if(num == arr[i]) break;
                index++;
            }

            if(index <= deque.size() / 2) {
                // 왼쪽으로 이동
                while(deque.peekFirst() != arr[i]) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                // 오른쪽으로 이동
                while(deque.peekFirst() != arr[i]) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }

            deque.pollFirst();
        }

        System.out.println(count);
    }
}
