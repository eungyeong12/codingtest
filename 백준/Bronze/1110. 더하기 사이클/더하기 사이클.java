import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n1;
        int n2;
        if(s.length() > 1)
            n1 = Integer.parseInt(String.valueOf(s.charAt(0)));
        else
            n1 = 0;
        n2 = Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));

        int count = 0;
        s = String.valueOf(n1) + String.valueOf(n2);
        String sum;
        String newN;

        while(true) {
            sum = String.valueOf(n1+n2);
            newN = n2 + String.valueOf(sum.charAt(sum.length()-1));
            count++;
            if(newN.equals(s)) break;
            n1 = Integer.parseInt(String.valueOf(newN.charAt(0)));
            n2 = Integer.parseInt(String.valueOf(newN.charAt(1)));
        }

        System.out.println(count);
    }
}
