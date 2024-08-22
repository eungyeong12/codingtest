import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken()); // 바퀴의 칸의 수
        int k = Integer.parseInt(st.nextToken()); // 바퀴를 돌리는 횟수

        char[] arr = new char[n];
        boolean[] alpha = new boolean[26];
        int pos = 0;

        for(int i=0; i<n; i++) {
            arr[i] = '?';
        }

        for(int i=0; i<k; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int s = Integer.parseInt(st.nextToken()); // 글자가 바뀐 횟수
            char c = st.nextToken().charAt(0); // 회전을 멈추었을 때 가리키는 글자

            pos = ((pos - s) % n + n) % n; // s만큼 움직였을 때의 배열 인덱스

            if(arr[pos] == '?') {
                if(alpha[c - 'A']) {
                    System.out.println("!");
                    return;
                }
                arr[pos] = c;
                alpha[c - 'A'] = true;
            } else if(arr[pos] != c) {
                System.out.println("!");
                return;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[(pos + i) % n]);
        }
        System.out.println();
    }
}

