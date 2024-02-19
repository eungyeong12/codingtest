import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<7; i++) {
            int n = sc.nextInt();
            if(n%2 != 0) {
                list.add(n);
                sum += n;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(Collections.min(list));
        }

        sc.close();
    }
}