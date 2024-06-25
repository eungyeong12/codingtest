import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for(int i=0; i<s.length; i++) {
            s[i] = br.readLine();
        }

        int count = 0;
        boolean duplication;
        ArrayDeque<Character> deque;
        for(String str : s) {
            duplication = false;
            deque = new ArrayDeque<>();
            for(int i=0; i<str.length(); i++) {
                if(deque.isEmpty())
                    deque.push(str.charAt(i));
                else {
                    if(deque.peek() == str.charAt(i)) {
                        deque.pop();
                    } else {
                        if(!deque.isEmpty())
                            if(deque.contains(str.charAt(i)))
                                duplication = true;
                    }
                    if(duplication)
                        break;
                    deque.push(str.charAt(i));
                }
            }
            if(!duplication)
                count++;
        }

        System.out.println(count);
    }
}
