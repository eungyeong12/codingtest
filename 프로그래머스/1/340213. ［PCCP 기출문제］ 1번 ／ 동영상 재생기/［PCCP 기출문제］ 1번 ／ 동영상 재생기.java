class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {        
        int vl = transferToSecond(video_len);
        int p = transferToSecond(pos);
        int os = transferToSecond(op_start);
        int oe = transferToSecond(op_end);

        if (isOpening(p, os, oe)) {
            p = oe;
        }
        
        for (String c : commands) {
            if (c.equals("prev")) {
                p = movePrev(p);
            } 
            if (c.equals("next")) {
                p = moveNext(vl, p);
            }
            if (isOpening(p, os, oe)) {
                p = oe;
            }
        }
        
        if (isOpening(p, os, oe)) {
            p = oe;
        }
        
        return transferToMinute(p);
    }
    
    public int movePrev(int p) {
        if (p - 10 < 0) {
            return 0;
        }
        return p - 10;
    }
    
    public int moveNext(int vl, int p) {
        if (p + 10 > vl) {
            return vl;
        }
        return p + 10;
    }
    
    public boolean isOpening(int p, int os, int oe) {
        return p >= os && p <= oe;
    }
     
    public int transferToSecond(String t) {
        String[] time = t.split(":");
        int m = Integer.parseInt(time[0]);
        int s = Integer.parseInt(time[1]);
        return 60 * m + s;
    }
    
    public String transferToMinute(int t) {
        StringBuilder sb = new StringBuilder();
        String m = String.valueOf(t / 60);
        String s = String.valueOf(t % 60);
        
        if (m.length() == 1) {
            sb.append("0");
        }
        sb.append(m).append(":");
        if (s.length() == 1) {
            sb.append("0");
        }
        sb.append(s);
        
        return sb.toString();
    }
}