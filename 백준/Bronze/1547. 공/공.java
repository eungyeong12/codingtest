import java.util.*;

class Cup {
    boolean b;

    public Cup(boolean b) {
        this.b = b;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cup[] c = new Cup[4];
        for(int i=1; i< c.length; i++) {
            c[i] = new Cup(false);
        }
        c[1].b = true;
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Cup temp;
            temp = c[x];
            c[x] = c[y];
            c[y] = temp;
        }
        for(int i=1; i< c.length; i++) {
            if(c[i].b)
                System.out.println(i);
        }
        sc.close();
    }
}