import java.util.*;
import java.io.*;

class Team {
    int id;
    Map<Integer, Integer> score;
    int count;
    int total;
    int time;
    Team(int id) {
        this.id = id;
        this.score = new HashMap<>();
        count = 0;
        total = 0;
        time = 0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int x=0; x<T; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 팀의 개수
            int k = Integer.parseInt(st.nextToken()); // 문제의 개수
            int t = Integer.parseInt(st.nextToken()); // 팀 ID
            int m = Integer.parseInt(st.nextToken()); // 로그 엔트리 개수
            List<Team> list = new ArrayList<>();
            for (int i=1; i<=n; i++) {
                list.add(new Team(i));
            }
            for (int y=0; y<m; y++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken()); // 팀 ID
                int j = Integer.parseInt(st.nextToken()); // 문제 번호
                int s = Integer.parseInt(st.nextToken()); // 획득한 점수
                Team team = list.get(i-1);
                if (team.score.containsKey(j)) {
                    if (team.score.get(j) < s) {
                        team.total = team.total - team.score.get(j) + s;
                        team.score.replace(j, s);
                    }
                } else {
                    team.score.put(j, s);
                    team.total += s;
                }
                team.count++;
                team.time = y;
            }
            Collections.sort(list, (a, b) -> {
                if (a.total != b.total)
                    return b.total - a.total;
                if (a.count != b.count)
                    return a.count - b.count;
                return a.time - b.time;
            });

            for (int i=0; i<n; i++) {
                if (list.get(i).id == t) {
                    System.out.println(i+1);
                }
            }
        }
    }
}