import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++) {
            String s = String.valueOf(i);
            if(s.length() == 1 || s.length() == 2) {
                count++;
                continue;
            }

            int sub = Integer.parseInt(String.valueOf(s.charAt(0))) - Integer.parseInt(String.valueOf(s.charAt(1)));
            boolean b = true;
            for(int j=2; j<s.length(); j++) {
                int prev = Integer.parseInt(String.valueOf(s.charAt(j-1)));
                int cur = Integer.parseInt(String.valueOf(s.charAt(j)));
                if(prev-cur != sub) {
                    b = false;
                    break;
                }
            }
            if(b) count++;
        }
        System.out.println(count);
    }
}
