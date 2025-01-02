import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                list.add(n);
                n = 0;
                if (i == myString.length()-1) {
                    list.add(n);
                    break;
                }
                continue;
            } 
            
            n++;
            if (i == myString.length()-1) {
                    list.add(n);
                    break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}