import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr = {9,7,8,0,9,2,1,4,1,8,n1,n2,n3};
        int sum = 0;

        for(int i=0; i<arr.length; i+=2)
            sum += arr[i];
        for(int i=1; i<arr.length; i+=2)
            sum += arr[i]*3;

        System.out.println("The 1-3-sum is " + sum);
        sc.close();
    }
}