import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 칭호의 개수
        int m = Integer.parseInt(st.nextToken()); // 칭호를 출력해야 하는 캐릭터들의 개수
        String[] s = new String[n];
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            s[i] = st.nextToken();
            nums[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<m; i++) {
            int power = Integer.parseInt(br.readLine());
            int index = binarySearchTitle(nums, power);
            sb.append(s[index]).append("\n");
        }
        System.out.println(sb);
    }
    
    public static int binarySearchTitle(int[] nums, int power) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= power) { 
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}