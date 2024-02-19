import java.io.*; 

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[8];
        int count = 0;
        for(int i=0; i<8; i++) {
            s[i] = br.readLine();
        }
        for(int i=0; i<8; i+=2) {
            for(int j=0; j<8; j+=2) {
                if(s[i].charAt(j) == 'F')
                    count++;
            }
        }
        for(int i=1; i<8; i+=2) {
            for(int j=1; j<8; j+=2) {
                if(s[i].charAt(j) == 'F')
                    count++;
            }
        }
        System.out.println(count);
    }
}