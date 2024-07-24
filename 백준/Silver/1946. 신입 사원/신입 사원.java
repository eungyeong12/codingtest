import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Score {
    int doc_score;
    int iv_score;
    Score(int doc_score, int iv_score) {
        this.doc_score = doc_score;
        this.iv_score = iv_score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st;
        int t = Integer.parseInt(s);
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Score> list = new ArrayList<>();
            for(int j=0; j<n; j++) {
                s = br.readLine();
                st = new StringTokenizer(s, " ");
                list.add(new Score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            Collections.sort(list, new Comparator<Score>() {
                @Override
                public int compare(Score o1, Score o2) {
                    return o1.doc_score - o2.doc_score; // 서류심사 성적 기준 정렬
                }
            });

            int count = 1; // 서류심사 1등은 합격
            int score = list.get(0).iv_score;
            for(int j=1; j<n; j++) {
                if(list.get(j).iv_score < score) { // 면접 성적이 기준 성적보다 높으면 합격 
                    count++;
                    score = list.get(j).iv_score;
                }
            }

            System.out.println(count);
        }
    }
}
