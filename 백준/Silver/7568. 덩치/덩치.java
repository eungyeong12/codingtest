import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Person {
    int n;
    int weight;
    int height;
    int rank;

    Person(int n, int weight, int height) {
        this.n = n;
        this.weight = weight;
        this.height = height;
        rank = 1;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        String s;
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            list.add(new Person(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for(Person p : list) {
            for(int i=0; i<n; i++) {
                if(p.n != i) {
                    if((list.get(i).height > p.height) && (list.get(i).weight > p.weight))
                        p.rank++;
                }
            }
        }

        for(Person p : list) {
            System.out.print(p.rank + " ");
        }
    }
}
