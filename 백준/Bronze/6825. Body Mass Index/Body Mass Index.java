import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
        if(BMI > 25)
            System.out.println("Overweight");
        if(BMI >= 18.5 && BMI <= 25)
            System.out.println("Normal weight");
        if(BMI < 18.5)
            System.out.println("Underweight");
        sc.close();
    }
}