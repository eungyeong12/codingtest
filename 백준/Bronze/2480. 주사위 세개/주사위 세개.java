import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int prize = 0;
        int max = Arrays.stream(arr).max().getAsInt();
        if(arr[0]==arr[1] && arr[0]==arr[2] && arr[1]==arr[2])
            prize += 10000 + arr[0] * 1000;
        else if(arr[0]==arr[1] || arr[0]==arr[2])
            prize += 1000 + arr[0] * 100;
        else if(arr[1]==arr[2])
            prize += 1000 + arr[1] * 100;
        else
            prize += max * 100;

        System.out.println(prize);

        sc.close();
    }
}