import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double p = (double)x / y;
        int n = sc.nextInt();

        double[] price = new double[n];
        for(int i=0; i<n; i++) {
            int w = sc.nextInt();
            int g = sc.nextInt();

            price[i] = (double)w / g;
        }

        double min = Arrays.stream(price).min().getAsDouble();
        if(p > min)
            System.out.printf("%.2f\n", min*1000);
        else
            System.out.printf("%.2f\n", p*1000);;
    }
}