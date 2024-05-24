import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        Set<String> set = new HashSet<>();
        set.add("c=");
        set.add("c-");
        set.add("d-");
        set.add("lj");
        set.add("nj");
        set.add("s=");
        set.add("z=");

        if(s.contains("dz=")) { // 3글자는 따로 처리
            s = s.replace("dz=", "*"); // 공백으로 만들어버리면 앞뒤 문자를 합쳐서 set에 포함되는 문자열이 될 수 있으므로
            count += s.chars().filter(c -> c == '*').count(); 
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(i == s.length()-1) {
                if (s.charAt(i) != '=' && s.charAt(i) != '-' && s.charAt(i) != '*')
                    count++;
                break;
            } else
                sb.append(s.charAt(i)).append(s.charAt(i+1));

            if(set.contains(sb.toString())) {
                count++;
                i++;
            } else {
                if(s.charAt(i) != '=' && s.charAt(i) != '-' && s.charAt(i) != '*')
                    count++;
            }
            sb.setLength(0);
        }

        System.out.println(count);
    }
}
