import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int c = Integer.parseInt(s);
        StringTokenizer st;
        for(int i=0; i<c; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];
            double sum = 0;
            for(int j=0; j<n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                sum += score[j];
            }
            double average = sum / n;
            double count = 0;
            for(int j=0; j<n; j++) {
                if(score[j] > average)
                    count++;
            }
            System.out.printf("%.3f%%\n", (count/n)*100);
        }
    }
}
