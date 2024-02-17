import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int score = 0;
        boolean isCorrected = false;
        for(int i=0; i<n; i++) {
            if(sc.nextInt() == 1) {
                score++;
                if(isCorrected)
                    sum += score;
                else
                    sum += 1;
                isCorrected = true;
            } else {
                score = 0;
                isCorrected = false;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}