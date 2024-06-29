import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Member {
    int age;
    String name;
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class memberComparator implements Comparator<Member> {

    @Override
    public int compare(Member o1, Member o2) {
        if(o1.age == o2.age)
            return 0;

        return o1.age - o2.age;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s;
        StringTokenizer st;
        List<Member> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(list, new memberComparator());

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).age + " " + list.get(i).name);
        }
    }
}
