import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1;
        StringBuilder s2;
        StringBuilder s3;
        StringBuilder sb;
        List<String> list = new ArrayList<>();

        for(int i=1; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                s1 = new StringBuilder(s.substring(0,i)).reverse();
                s2 = new StringBuilder(s.substring(i,j)).reverse();
                s3 = new StringBuilder(s.substring(j)).reverse();
                sb = new StringBuilder();
                sb.append(s1).append(s2).append(s3);
                list.add(sb.toString());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
