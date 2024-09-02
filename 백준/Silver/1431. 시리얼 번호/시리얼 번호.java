import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length())
                    return o1.length() - o2.length();
                int sum1 = 0;
                int sum2 = 0;
                for(int i=0; i<o1.length(); i++) {
                    int num1 = o1.charAt(i) - '0';
                    int num2 = o2.charAt(i) - '0';
                    if(num1 > 0 && num1 < 10) sum1 += num1;
                    if(num2 > 0 && num2 < 10) sum2 += num2;
                }
                if(sum1 != sum2)
                    return sum1 - sum2;
                return o1.compareTo(o2);
            }
        });

        for(String s : list)
            System.out.println(s);
    }
}
