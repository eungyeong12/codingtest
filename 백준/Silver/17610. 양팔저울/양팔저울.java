import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] weights = new int[k];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int sum = 0;
        for(int i=0; i<k; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
            sum += weights[i];
        }

        Set<Integer> possibleWeights = new HashSet<>();

        findWeights(0, 0, weights, possibleWeights);

        System.out.println(sum - possibleWeights.size());

    }

    static void findWeights(int index, int currentWeight, int[] weights, Set<Integer> possibleWeights) {
        // 모든 추를 다 사용한 경우
        if(index == weights.length) {
            if(currentWeight > 0)
                possibleWeights.add(currentWeight);
            return;
        }

        // 추를 왼쪽 저울에 놓는 경우
        findWeights(index+1, currentWeight + weights[index], weights, possibleWeights);
        // 추를 오른쪽 저울에 놓는 경우
        findWeights(index+1, currentWeight - weights[index], weights, possibleWeights);
        // 추를 사용하지 않는 경우
        findWeights(index+1, currentWeight, weights, possibleWeights);
    }
}
