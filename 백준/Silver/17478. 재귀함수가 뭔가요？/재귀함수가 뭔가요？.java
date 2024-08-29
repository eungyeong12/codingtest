import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        String s1 = "\"재귀함수가 뭔가요?\"\n";
        String s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        String s5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String s6 = "라고 답변하였지.\n";
        String[] str = new String[4];
        str[0] = s1;
        str[1] = s2;
        str[2] = s3;
        str[3] = s4;
        String[] str2 = new String[2];
        str2[0] = s1;
        str2[1] = s5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<4; j++) {
                for(int k=0; k<i*4; k++)
                    sb.append("_");
                sb.append(str[j]);
            }
        }

        for(int i=0; i<2; i++) {
            for(int j=0; j<n*4; j++) {
                sb.append("_");
            }
            sb.append(str2[i]);
        }

        for(int i=n; i>=0; i--) {
            for(int j=0; j<i*4; j++) {
                sb.append("_");
            }
            sb.append(s6);
        }
        System.out.println(sb);
    }
}
