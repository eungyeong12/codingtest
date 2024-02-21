import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        for(int i=1; i<n; i++) {
            String s2 = sc.nextLine();
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) != s2.charAt(j))
                    c[j] = '?';
            }
        }

        System.out.println(String.valueOf(c));
        sc.close();
    }
}