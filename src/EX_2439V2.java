import java.util.Scanner;

public class EX_2439V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char[][] arr = new char[a][a];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                arr[i][j] = ' ';
            }
        }

        for(int i = a-1; i >= 0; i--) {
            for(int j = a-1; j >= a-1-i; j--) {
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
