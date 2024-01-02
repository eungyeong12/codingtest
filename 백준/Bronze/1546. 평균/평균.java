import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double max = 0;
        for(int i=0; i<n; i++) {
            score[i] = sc.nextInt();
            if(max < score[i])
                max = score[i];
        }
        double sum = 0;
        for(int i=0; i<n; i++) {
            sum += score[i]/max*100;
        }
        double average = sum/n;
        System.out.println(average);
        sc.close();
    }
}