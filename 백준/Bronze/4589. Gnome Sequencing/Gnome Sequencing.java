import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Gnomes:");
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int[] arr = new int[3];
            for(int j=0; j<3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] < arr[1] && arr[1] < arr[2])
                System.out.println("Ordered");
            else if(arr[0] > arr[1] && arr[1] > arr[2])
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
        sc.close();
    }
}