import java.util.Scanner;

public class EX_2441V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[][] arr = new String[a][a];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                arr[i][j] = " ";
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j <= a-1; j++) {
                arr[i][j] = "*";
            }
        }
        for(int i = 0; i < a; i++) {
            System.out.println(String.join("", arr[i]));
        }
    }
}
