import java.util.Scanner;

public class EX_2440V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[][] str = new String[a][a];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                str[i][j] = "";
            }
        }
        for(int i = 0; i < a; i++) {
            for(int j = a-1; j >= i; j--) {
                str[i][j] = "*";
            }
        }
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print(String.join(" ", str[i][j]));
            }
            System.out.println();
        }
    }
}
