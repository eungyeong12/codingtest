import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int i = 1;
        int cross_count = 0;
        while(count < n) {
            count += i;
            i++;
            cross_count++;
        }

        if(count == n) {
            if(cross_count % 2 == 0)
                System.out.println(cross_count + "/" + 1);
            else
                System.out.println(1 + "/" + cross_count);
            return;
        }

        count -= cross_count;
        int c;
        int p;
        if(cross_count % 2 == 0) {
            c = 1;
            p = cross_count;
        } else {
            c = cross_count;
            p = 1;
        }
        while(true) {
            count++;
            if(count == n) {
                System.out.println(c + "/" + p);
                break;
            } else {
                if(cross_count % 2 == 0) {
                    c++;
                    p--;
                } else {
                    c--;
                    p++;
                }
            }
        }
    }
}
