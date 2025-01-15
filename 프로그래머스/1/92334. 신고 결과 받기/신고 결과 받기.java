import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<id_list.length; i++) {
            map.put(id_list[i], i);
        }
        
        Set<Integer>[] set = new HashSet[id_list.length];
 
        for (int i=0; i<set.length; i++) {
            set[i] = new HashSet<Integer>();
        }
        
        for (String r : report) {
            String[] u = r.split(" ");
            set[map.get(u[0])].add(map.get(u[1]));
        }
        
        int[] count = new int[id_list.length];
        
        for (Set<Integer> s : set) {
            for (int u : s) {
                count[u]++;
            }
        }
        
        for (int i=0; i<set.length; i++) {
            for (int u : set[i]) {
                if (count[u] >= k) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}