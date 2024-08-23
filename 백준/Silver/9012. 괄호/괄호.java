import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String s;
        Stack<Character> stack;
        boolean isNo;

        for(int i=0; i<t; i++) {
            stack = new Stack<>();
            s = br.readLine();
            isNo = false;
            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if(c == '(') {
                    stack.push(c);
                } else {
                    if(stack.isEmpty()) {
                        System.out.println("NO");
                        isNo = true;
                        break;
                    }
                    stack.pop();
                }
            }

            if(!isNo) {
                if(stack.isEmpty()) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
