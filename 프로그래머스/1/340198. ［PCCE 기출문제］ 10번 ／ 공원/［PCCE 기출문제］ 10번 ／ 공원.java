import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);
        
        for (int m=mats.length-1; m>=0; m--) {
            int mat = mats[m];
            
            for (int i=0; i<=park.length-mat; i++) {
                for (int j=0; j<=park[i].length-mat; j++) {
                    
                    boolean ans = true;
                    
                    for (int x=i; x<i+mat; x++) {
                        for (int y=j; y<j+mat; y++) {
                            if (!park[x][y].equals("-1")) {
                                ans = false;
                                break;
                            }
                        }
                    }
                    
                    if (ans) {
                        return mat;
                    }
                }
            }
        }
        
        return answer;
    }
}