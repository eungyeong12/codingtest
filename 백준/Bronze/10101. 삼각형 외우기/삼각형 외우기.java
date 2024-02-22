import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int sum = 0;
        for(int i=0; i<3; i++) {
            n[i] = sc.nextInt();
            sum += n[i];
        }

        if(n[0]==60 && n[1]==60 && n[2]==60)
            System.out.println("Equilateral");
        else if(sum == 180 && (n[0]==n[1] || n[0]==n[2] || n[1]==n[2]))
            System.out.println("Isosceles");
        else if(sum == 180)
            System.out.println("Scalene");
        else
            System.out.println("Error");
        sc.close();
    }
}