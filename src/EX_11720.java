import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EX_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        for(int i = 0; i < num; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
