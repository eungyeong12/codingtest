import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList[] list = new ArrayList[9];
        for(int i=0; i<9; i++) {
            list[i] = new ArrayList<>();
            for(int j=0; j<9; j++) {
                list[i].add(sc.nextInt());
            }
        }

        List<Integer> m = new ArrayList<>();
        for(int i=0; i<9; i++) {
            m.add((int) Collections.max(list[i]));
        }

        int max = Collections.max(m);

        System.out.println(max);

        int firstIndex = m.indexOf(max);
        int secondIndex = list[firstIndex].indexOf(max);
        System.out.println((firstIndex+1) + " " + (secondIndex+1));
        sc.close();
    }
}