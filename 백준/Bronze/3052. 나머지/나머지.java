import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];
        for(int i=0; i<10; i++) {
            list[i] = scanner.nextInt() % 42;
        }
        Arrays.sort(list);
        int count = 1;
        for(int i=1; i<10; i++) {
            if(list[i] != list[i-1])
                count++;
        }
        System.out.println(count);
    }
}