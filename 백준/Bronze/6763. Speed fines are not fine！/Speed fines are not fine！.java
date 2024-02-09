import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int fine = 0;

        if(n1 >= n2) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            if(n2-n1 >= 1 && n2-n1 <= 20)
                fine = 100;
            else if(n2-n1 >= 21 && n2-n1 <= 30)
                fine = 270;
            else if(n2-n1 >= 31)
                fine = 500;
            System.out.println("You are speeding and your fine is $" + fine + ".");
        }

        sc.close();
    }
}