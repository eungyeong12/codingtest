import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<9; i++)
            list.add(sc.nextInt());

        int max = Collections.max(list);
        int index = list.indexOf(max);

        System.out.println(max);
        System.out.println(index+1);
        sc.close();
    }
}