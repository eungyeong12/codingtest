public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<10001; i++) {
            int n = d(i);
            if(n < 10001)
                arr[d(i)] = true;
        }
        for(int i=1; i<10001; i++) {
            if(!arr[i])
                sb.append(i + "\n");
        }
        System.out.println(sb);
    }

    static int d(int n) {
        String s = String.valueOf(n);
        int sum = n;
        for(int i=0; i<s.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += num;
        }
        return sum;
    }
}
