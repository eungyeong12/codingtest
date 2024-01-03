import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수의 개수
        int m = sc.nextInt(); // 합을 구해야 하는 횟수
        int[] arr = new int[n];
        int[] s = new int[n];
        int sum = 0;
        int i; // 합을 구해야 하는 구간
        int j;
        for(int x=0; x<n; x++) {
            arr[x] = sc.nextInt();
            s[x] = arr[x] + sum;
            sum += arr[x];
        }
        int[] result = new int[m];
        for(int y=0; y<m; y++) {
            i = sc.nextInt(); // 합을 구해야 하는 구간
            j = sc.nextInt();
            if(i>j) {
                try {
                    result[y] = s[i - 1] - s[j - 2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    result[y] = s[i - 1];
                }
            } else {
                try {
                    result[y] = s[j - 1] - s[i - 2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    result[y] = s[j - 1];
                }
            }
        }
        for(int k=0; k<m; k++) {
            System.out.println(result[k]);
        }
        sc.close();
    }
}