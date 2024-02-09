import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int t = 0;
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i=0; i<4; i++) {
            s += Integer.parseInt(st.nextToken());
        }
        str = sc.nextLine();
        st = new StringTokenizer(str, " ");
        for(int i=0; i<4; i++) {
            t += Integer.parseInt(st.nextToken());
        }

        if(s >= t)
            System.out.println(s);
        else
            System.out.println(t);
        sc.close();
    }
}