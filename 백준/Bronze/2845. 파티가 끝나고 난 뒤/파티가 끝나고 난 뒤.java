import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int p = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        str = sc.nextLine();
        st = new StringTokenizer(str, " ");
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int people = p * area;
        int[] answer = new int[5];
        for(int i=0; i<5; i++) {
            answer[i] = arr[i] - people;
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }
}