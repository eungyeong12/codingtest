import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s); // 스위치의 개수
        int[] state = new int[n]; // 스위치의 상태
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++) {
            state[i] = Integer.parseInt(st.nextToken());
        }
        int studentNum = Integer.parseInt(br.readLine());
        for(int i=0; i<studentNum; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(gender == 1) {
                for(int j=num; j<=n; j++) {
                    if(j % num == 0) {
                        if(state[j-1] == 1)
                            state[j-1] = 0;
                        else
                            state[j-1] = 1;
                    }
                }
            } else if(gender == 2) {
                int p = num-1;
                int q = num+1;
                while(p>=1 && q<=n) {
                    if(state[p-1] == state[q-1]) {
                        p--;
                        q++;
                    } else {
                        break;
                    }
                }

                p++;
                q--;
                for(int k=p; k<=q; k++) {
                    if(state[k-1] == 1)
                        state[k-1] = 0;
                    else
                        state[k-1] = 1;
                }
            }
        }

        int index = 0;
        while(n > 0) {
            if(n > 20) {
                for(int i=index; i<index+20; i++)
                    System.out.print(state[i] + " ");
                System.out.println();
                index += 20;
                n -= 20;
            } else {
                for(int i=index; i<index+n; i++)
                    System.out.print(state[i] + " ");
                n = 0;
            }
        }

    }
}
