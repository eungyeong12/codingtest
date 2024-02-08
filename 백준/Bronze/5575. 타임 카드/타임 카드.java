import java.util.*;

class T {
    int h1;
    int m1;
    int s1;

    int h2;
    int m2;
    int s2;

    public T(int h1, int m1, int s1, int h2, int m2, int s2) {
        this.h1 = h1;
        this.m1 = m1;
        this.s1 = s1;
        this.h2 = h2;
        this.m2 = m2;
        this.s2 = s2;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T[] t = new T[3];
        int h1;
        int m1;
        int s1;
        int h2;
        int m2;
        int s2;
        for(int i=0; i<3; i++) {
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            s1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();
            s2 = sc.nextInt();
            t[i] = new T(h1, m1, s1, h2, m2, s2);
        }

        int h;
        int m;
        int s;

        for(int i=0; i<3; i++) {
            if(t[i].s2 - t[i].s1 < 0) {
                if(t[i].m2 > 0) {
                    t[i].m2--;
                } else {
                    t[i].h2--;
                    t[i].m2 = 59;
                }
                s = 60 + t[i].s2 - t[i].s1;
            } else {
                s = t[i].s2 - t[i].s1;
            }
            if(t[i].m2 - t[i].m1 < 0) {
                t[i].h2--;
                t[i].m2 += 60;
            }
            m = t[i].m2 - t[i].m1;
            h = t[i].h2 - t[i].h1;
            System.out.println(h + " " + m + " " + s);
        }

        sc.close();
    }
}