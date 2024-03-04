import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAnswer = false;

        for(int i=0; i<5; i++) {
            if (sc.nextLine().contains("FBI")) {
                isAnswer = true;
                System.out.print(i+1 + " ");
            }
        }

        if(!isAnswer)
            System.out.println("HE GOT AWAY!");
    }
}