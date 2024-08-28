import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(64);
        int sum = 64;

        while(true) {
            if(sum > x) {
                int n =  list.remove(list.size()-1);
                int half = n/2;
                sum -= n;
                list.add(half);
                sum += half;
                if(sum < x) {
                    list.add(half);
                    sum += half;
                }
            }
            if(sum == x) {
                System.out.println(list.size());
                return;
            }
        }
    }
}
