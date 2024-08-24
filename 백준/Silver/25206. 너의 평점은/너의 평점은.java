import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        double creditSum = 0;

        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(grade.equals("P"))
                continue;

            creditSum += credit;
            result += getScore(credit, grade);
        }

        System.out.println(result / creditSum);
    }

    static double getScore(double credit, String grade) {
        switch (grade) {
            case "A+":
                return credit * 4.5;
            case "A0":
                return credit * 4.0;
            case "B+":
                return credit * 3.5;
            case "B0":
                return credit * 3.0;
            case "C+":
                return credit * 2.5;
            case "C0":
                return credit * 2.0;
            case "D+":
                return credit * 1.5;
            case "D0":
                return credit * 1.0;
            case "F":
                return 0.0;
            default:
                break;
        }
        return 0.0;
    }
}
