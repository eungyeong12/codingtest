import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();
            if(s.equals("#"))
                break;
            char[] c = {'A','E','I','O','U','a','e','i','o','u'};
            char[] c2 = s.toCharArray();
            int count = 0;

            for(char c3 : c2) {
                for(char c4 : c) {
                    if(c3 == c4)
                        count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}