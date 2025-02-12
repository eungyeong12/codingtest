import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] t = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[0] = Integer.parseInt(st.nextToken());
            t[1]= Integer.parseInt(st.nextToken());
            t[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(t);
            if (t[0] == 0 && t[1] == 0 && t[2] == 0)
                break;

            if (t[2] >= t[0] + t[1])
                System.out.println("Invalid");
            else if (t[0] == t[1] && t[1] == t[2] && t[2] == t[0])
                System.out.println("Equilateral");
            else if ((t[0] == t[1] && t[1] != t[2])
                    || (t[0] != t[1] && t[1] == t[2])
                    || (t[0] != t[1] && t[2] == t[0]))
                System.out.println("Isosceles");
            else if (t[0] != t[1] && t[1] != t[2] && t[2] != t[0])
                System.out.println("Scalene");
            else
                System.out.println("Invalid");
        }
    }
}