import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EX_11021 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int a = 0;
        for(int i = 0; i < num; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr[i] = x + y;
        }
        for(int j = 0; j < num; j++) {
            a++;
            System.out.println("Case #" + a + ": " + arr[j]);
        }
    }
}