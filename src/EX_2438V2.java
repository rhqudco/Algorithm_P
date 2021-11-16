import java.io.BufferedReader;
import java.util.Scanner;

public class EX_2438V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char[][] arr = new char[a][a];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                arr[i][j] = ' ';
            }
        }

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < i+1; j++) {
                arr[i][j] = '*';
            }
        }
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
