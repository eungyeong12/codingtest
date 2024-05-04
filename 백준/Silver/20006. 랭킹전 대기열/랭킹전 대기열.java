import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Room {
        int size;
        boolean isFull = false;
        ArrayList<String> players;

        Room(int m) {
            players = new ArrayList<>(m);
            this.size = m;
        }

        boolean push(String player) {
            if(isFull)
                return false;

            players.add(player);

            if(players.size() == size)
                isFull = true;
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> players = new HashMap<>();
        ArrayList<Room> list = new ArrayList<>();

        s = br.readLine();
        st = new StringTokenizer(s, " ");
        list.add(new Room(m));
        int l = Integer.parseInt(st.nextToken());
        String n = st.nextToken();
        players.put(n, l);
        list.get(0).push(n);

        for(int i=1; i<p; i++) {
            s = br.readLine();
            st = new StringTokenizer(s, " ");
            l = Integer.parseInt(st.nextToken());
            n = st.nextToken();
            players.put(n, l);
            boolean isEntered = false;
            for(int j=0; j<list.size(); j++) {
                int criteria = players.get(list.get(j).players.get(0));
                if(Math.abs(criteria - l) <= 10)
                    if(list.get(j).push(n))
                        isEntered = true;
                if(isEntered) break;
            }
            if(!isEntered) {
                list.add(new Room(m));
                list.get(list.size()-1).push(n);
            }
        }

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).isFull)
                System.out.println("Started!");
            else
                System.out.println("Waiting!");

            Collections.sort(list.get(i).players);
            for(int j=0; j<list.get(i).players.size(); j++) {
                String player = list.get(i).players.get(j);
                System.out.println(players.get(player) + " " + player);
            }
        }
    }
}