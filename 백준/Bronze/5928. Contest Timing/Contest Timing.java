import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int date = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int answer = (date-11)*24*60 + (h-11)*60 + (m-11);
        System.out.println((answer < 0) ? -1 : answer);

        sc.close();
    }
}