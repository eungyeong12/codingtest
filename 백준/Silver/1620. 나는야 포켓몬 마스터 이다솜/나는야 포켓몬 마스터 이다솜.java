import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> pokemon = new HashMap<>();
        Map<Integer, String> pokemonNum = new HashMap<>();

        for(int i=1; i<=n; i++) {
            String name = br.readLine();
            pokemon.put(name, i);
            pokemonNum.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            String s = br.readLine();
            if(pokemon.containsKey(s))
                sb.append(pokemon.get(s) + "\n");
            else
                sb.append(pokemonNum.get(Integer.parseInt(s)) + "\n");
        }

        System.out.println(sb);
    }
}
