import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == 'e')
                    sb.append('i');
                else if(s.charAt(i) == 'i')
                    sb.append('e');
                else if(s.charAt(i) == 'E')
                    sb.append('I');
                else if(s.charAt(i) == 'I')
                    sb.append('E');
                else
                    sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}