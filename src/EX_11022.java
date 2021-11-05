import java.io.*;
import java.util.StringTokenizer;

public class EX_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int c = 0;
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            c += 1;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + c + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        bw.close();
    }
}
