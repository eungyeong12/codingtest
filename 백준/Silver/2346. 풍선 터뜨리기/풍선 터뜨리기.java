import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Balloon {
    int pos;
    int val;
    Balloon(int pos, int val) {
        this.pos = pos;
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Balloon> list = new ArrayList<>();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for(int i=0; i<n; i++)
            list.add(new Balloon(i, Integer.parseInt(st.nextToken())));

        StringBuilder sb = new StringBuilder();

        int pos = 0;
        int val = list.get(pos).val;
        sb.append(list.get(pos).pos+1).append(" ");
        list.remove(pos);

        while(!list.isEmpty()) {
            if(val > 0) {
                pos = (pos + (val - 1)) % list.size();
            } else {
                pos = (pos + val) % list.size();
                if (pos < 0) {
                    pos += list.size();
                }
            }

            val = list.get(pos).val;
            sb.append(list.get(pos).pos + 1).append(" ");
            list.remove(pos);
        }

        System.out.println(sb.toString().trim());
    }
}
