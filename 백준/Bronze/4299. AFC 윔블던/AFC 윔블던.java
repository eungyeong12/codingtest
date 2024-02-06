import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        if((sum + sub) % 2 != 0 || sum < sub) {
            System.out.println(-1);
        } else {
            int score1 = (sum + sub) / 2;
            int score2 = sum - score1;
            System.out.println(score1 + " " + score2);
        }
        sc.close();
    }
}