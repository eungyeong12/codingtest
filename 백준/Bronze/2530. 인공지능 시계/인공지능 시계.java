import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] currentTime = new int[3];
        for(int i=0; i<3; i++) {
            currentTime[i] = Integer.parseInt(st.nextToken());
        }
        int t = sc.nextInt();

        int h = (t / 60) / 60;
        int m = (t / 60) % 60;
        int s = t % 60;

        int[] result = new int[3];
        result[0] = currentTime[0] + h;
        result[1] = currentTime[1] + m;
        result[2] = currentTime[2] + s;

        for(int i=2; i>0; i--) {
            if(result[i] >= 60) {
                while(!(result[i] < 60)) {
                    result[i-1]++;
                    result[i] %= 60;
                }
            }
        }

        if(result[0] >= 24) {
            while(!(result[0] < 24))
                result[0] -= 24;
        }

        for(int i=0; i<3; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}