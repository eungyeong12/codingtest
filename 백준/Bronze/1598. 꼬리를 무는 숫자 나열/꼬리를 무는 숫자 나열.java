import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int length = 0;

        int n1_r = n1 % 4;
        if(n1_r == 0) n1_r = 4;
        int n2_r = n2 % 4;
        if(n2_r == 0) n2_r = 4;
        length += Math.abs(n1_r - n2_r);
        if(n1_r - n2_r > 0) n1 -= Math.abs(n1_r - n2_r);
        else n1 += Math.abs(n1_r - n2_r);
        System.out.println(length + ((Math.abs(n2-n1))/4));
        sc.close();
    }
}