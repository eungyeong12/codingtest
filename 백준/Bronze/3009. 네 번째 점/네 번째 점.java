import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;
        int[] x = new int[3];
        int[] y = new int[3];

        for(int i=0; i<3; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int fourthX;
        int fourthY;
        
        if(x[0] == x[1])
            fourthX = x[2];
        else if(x[0] == x[2])
            fourthX = x[1];
        else 
            fourthX = x[0];
        
        if(y[0] == y[1])
            fourthY = y[2];
        else if(y[0] == y[2])
            fourthY = y[1];
        else 
            fourthY = y[0];

        System.out.println(fourthX + " " + fourthY);
    }
}
