import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int count = 0;
        int[] arr = new int[10];

        for(int i=0; i<s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(num == 6 || num == 9) {
                count++;
                continue;
            }
            arr[num % 10]++;
        }

        Arrays.sort(arr);
        count = (count + 1) / 2;
        System.out.println(Math.max(arr[arr.length-1], count));
    }
}
