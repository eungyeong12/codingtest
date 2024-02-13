import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.next();
            if(s.equals("0")) break;
            int sum = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '1')
                    sum += 3;
                else if(s.charAt(i) == '0')
                    sum += 5;
                else
                    sum += 4;
            }
            System.out.println(sum+1);
        }
        sc.close();
    }
}