import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = w-x;
        arr[3] = h-y;
        System.out.println(Arrays.stream(arr).min().getAsInt());
        sc.close();
    }
}