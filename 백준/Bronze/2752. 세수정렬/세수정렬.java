import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(int i=0; i<3; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}