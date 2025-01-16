import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String c : callings) {
            int i = map.get(c);
            
            String temp = players[i];
            players[i] = players[i-1];
            players[i-1] = temp;
            
            map.replace(players[i-1], i-1);
            map.replace(players[i], i);
        }
        return players;
    }
}