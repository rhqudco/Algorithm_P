import java.io.*;
import java.util.StringTokenizer;

public class EX_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i  < num_1; i++) {
            int value = Integer.parseInt(st.nextToken());
            if(value < num_2) {
                sb.append(value).append(" ");
            }
        }
        br.close();
        System.out.println(sb);
    }
}