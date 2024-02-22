import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c  = new char[n];
        Set<Character> set = new HashSet<>();
        boolean isAnswer = false;

        for(int i=0; i<n; i++) {
            c[i] = sc.next().charAt(0);
            set.add(c[i]);
        }

        int count = 0;
        for(char c2 : set) {
            count = 0;
            for(int i=0; i<n; i++) {
                if(c2 == c[i]) {
                    count++;
                }
                if(count >= 5) {
                    System.out.print(c2);
                    isAnswer = true;
                    break;
                }
            }
        }

        if(!isAnswer)
            System.out.println("PREDAJA");
        sc.close();
    }

}