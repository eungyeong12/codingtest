import java.util.*;

class Student {
    int n;
    int rank;
    Student(int n, int rank) {
        this.n = n;
        this.rank = rank;
    }
    
    public int getRank() {
        return rank;
    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Student> list = new ArrayList<>();
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                list.add(new Student(i, rank[i]));
            } 
        }
        
        Collections.sort(list, (a, b) -> a.getRank() - b.getRank());
        return 10000 * list.get(0).n + 100 * list.get(1).n + list.get(2).n;
    }
}