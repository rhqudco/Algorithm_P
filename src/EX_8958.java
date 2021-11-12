import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EX_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int ca = Integer.parseInt(br.readLine());
        String[] str = new String[ca];


        for(int i = 0; i < ca; i++) {
            str[i] = br.readLine();
        }
        for(int i = 0; i < ca; i++) {
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j)== 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
