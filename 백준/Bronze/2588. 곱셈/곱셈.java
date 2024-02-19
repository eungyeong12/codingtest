import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s2 = sc.nextLine();
        int i1 = Integer.parseInt(s2.substring(0,1)); // 3
        int i2 = Integer.parseInt(s2.substring(1,2)); // 8
        int i3 = Integer.parseInt(s2.substring(2,3)); // 5

        int n3 = n*i3;
        int n4 = n*i2;
        int n5 = n*i1;
        int n6 = n3+n4*10+n5*100;

        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

        sc.close();
    }
}