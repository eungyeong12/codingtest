import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니의 수
        int m = scanner.nextInt(); // m번

        int[] arr = new int[n+1];
        for(int k=1; k<n+1; k++) {
            arr[k] = k;
        }
        for(int x=0; x<m; x++) {
            int i = scanner.nextInt(); // i부터
            int j = scanner.nextInt(); // j까지
            for(int y=j; j>=i; j--) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                if(i == j)
                    break;
            }
        }
        for(int w=1; w<=n; w++) {
            System.out.print(arr[w] + " ");
        }
    }
}