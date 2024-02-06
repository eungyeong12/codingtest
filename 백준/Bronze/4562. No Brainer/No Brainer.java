import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++) {
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x >= y)
                System.out.println("MMM BRAINS");
            else
                System.out.println("NO BRAINS");
        }
        sc.close();
    }
}