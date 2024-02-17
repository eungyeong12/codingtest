import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int f = sc.nextInt();
        for(int i=0; i<s.length()-2; i++) {
            sb.append(s.charAt(i));
        }
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                sb.append(i).append(j);
                int n = Integer.parseInt(sb.toString());
                if(n % f == 0) {
                    System.out.println("" + i + j);
                    return;
                }
                sb.delete(s.length()-2, s.length());
            }
        }
        sc.close();
    }
}