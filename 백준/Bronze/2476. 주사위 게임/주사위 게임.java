import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[3];
        int[] prize = new int[n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                num[j] = sc.nextInt();
            }

            if(num[0] == num[1] && num[1] == num[2])
                prize[i] = 10000+num[0]*1000;
            else if(num[0] == num[1] || num[0] == num[2])
                prize[i] += 1000+num[0]*100;
            else if(num[1] == num[2])
                prize[i] += 1000+num[1]*100;
            else
                prize[i] += Arrays.stream(num).max().getAsInt()*100;
        }
        System.out.println(Arrays.stream(prize).max().getAsInt());
        sc.close();
    }
}