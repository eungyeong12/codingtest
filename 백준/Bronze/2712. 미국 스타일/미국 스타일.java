import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            double n = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            if(unit.equals("kg"))
                System.out.printf("%.4f lb\n", n*2.2046);
            else if(unit.equals("l"))
                System.out.printf("%.4f g\n", n*0.2642);
            else if(unit.equals("lb"))
                System.out.printf("%.4f kg\n", n*0.4536);
            else if(unit.equals("g"))
                System.out.printf("%.4f l\n", n*3.7854);
        }

        br.close();
    }
}