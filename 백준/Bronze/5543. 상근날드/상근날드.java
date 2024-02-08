import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        for(int i=0; i<3; i++)
            burger[i] = sc.nextInt();

        int[] beverage = new int[2];
        for(int i=0; i<2; i++)
            beverage[i] = sc.nextInt();

        int minBurger = Arrays.stream(burger).min().getAsInt();
        int minBeverage = Arrays.stream(beverage).min().getAsInt();

        System.out.println(minBeverage + minBurger - 50);
        sc.close();
    }
}