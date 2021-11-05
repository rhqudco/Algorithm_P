import java.sql.Array;
import java.util.Scanner;

public class EX_10950 { //https://www.acmicpc.net/problem/10950
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr[i] = x + y;
        }
        for (int j = 0; j < num; j++) {
            System.out.println(arr[j]);
        }
    }
}
