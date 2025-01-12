import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<friends.length; i++) {
            map.put(friends[i], i);
        }
        
        int[][] gift = new int[friends.length][friends.length];
        int[][] records = new int[friends.length][3];
        
        for (String g : gifts) {
            String[] s = g.split(" ");
            gift[map.get(s[0])][map.get(s[1])]++;
            records[map.get(s[0])][0]++;
            records[map.get(s[1])][1]++;
        }
        
        for (int[] record : records) {
            record[2] = record[0] - record[1];
        }
        
        for (int i=0; i<gift.length; i++) {
            int count = 0;
            for (int j=0; j<gift[i].length; j++) {
                if (i==j) continue;
                if (gift[i][j] > gift[j][i]) {
                    count++;
                } else if (gift[i][j] < gift[j][i]) {
                    continue;
                } else {
                    if (records[i][2] > records[j][2]) {
                        count++;
                    }
                }
            }
            if (answer < count) {
                answer = count;
            }
        }
        return answer;
    }
}