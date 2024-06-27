import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++)
            set.add(br.readLine());

        String[] str = set.toArray(new String[0]);

        Arrays.sort(str);
        for(int i=1; i<str.length; i++) {
            int index = i;
            while(index > 0) {
                if(str[index].length() < str[index-1].length())
                    swap(str, index, index-1);
                index--;
            }
        }

        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);
        }
    }

    static void swap(String[] str, int i, int j) {
        String t = str[i];
        str[i] = str[j];
        str[j] = t;
    }
}
