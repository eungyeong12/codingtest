import java.util.*;
import java.io.*;

class Room {
    List<String> players;
    int minLevel;

    Room(int level, String player) {
        this.players = new ArrayList<>();
        players.add(player);
        this.minLevel = level;
    }
    void addPlayer(String player) {
        players.add(player);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Room> list = new ArrayList<>();
        Map<String, Integer> players = new HashMap<>();
        for(int i=0; i<p; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            String n = st.nextToken();
            players.put(n, l);
            if (list.isEmpty()) {
                list.add(new Room(l, n));
            } else {
                boolean b = false;
                for (Room r : list) {
                    if (r.players.size() < m && Math.abs(r.minLevel - l) <= 10) {
                        r.addPlayer(n);
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    list.add(new Room(l, n));
                }
            }
        }
        for (Room r : list) {
            Collections.sort(r.players);
            if (r.players.size() == m) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }
            for (int i=0; i<r.players.size(); i++) {
                System.out.println(players.get(r.players.get(i)) + " " + r.players.get(i));
            }
        }
    }
}