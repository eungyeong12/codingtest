import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if(s.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(s, " ");
            int m = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            System.out.println(m + f);
        }
        sc.close();
    }
}