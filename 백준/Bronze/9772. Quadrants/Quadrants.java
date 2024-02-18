import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if(x == 0 && y == 0) {
                System.out.println("AXIS");
                break;
            }

            if(x==0 || y==0)
                System.out.println("AXIS");
            else if(x>0 && y>0)
                System.out.println("Q1");
            else if(x<0 && y>0)
                System.out.println("Q2");
            else if(x<0 && y<0)
                System.out.println("Q3");
            else if(x>0 && y<0)
                System.out.println("Q4");
        }
        sc.close();
    }
}