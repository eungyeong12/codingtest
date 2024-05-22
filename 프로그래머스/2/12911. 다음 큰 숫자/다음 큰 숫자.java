class Solution {
    public int solution(int n) {
        int answer = 0;
        String n1 = Integer.toBinaryString(n);
        int countN1 = 0;
        for(int i=0; i<n1.length(); i++) 
            if(n1.charAt(i) == '1')
                countN1++;
        int num = n+1;
        while(true) {
            String n2 = Integer.toBinaryString(num);
            int countN2 = 0;
            for(int i=0; i<n2.length(); i++) 
                if(n2.charAt(i) == '1')
                    countN2++;
            if(countN1 == countN2) break;
            num++;
        }

        return num;
    }
}