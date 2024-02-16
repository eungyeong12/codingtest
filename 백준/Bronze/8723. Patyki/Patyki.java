import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        if(arr[0] == arr[1] && arr[1] == arr[2])
            System.out.println(2);
        else if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
            System.out.println(1);
        else
            System.out.println(0);

        sc.close();
    }
}