import java.util.Scanner;

public class EX_2442 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[][] str = new String[a][2*a-1];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < 2*a-1; j++)  {
                str[i][j] = " ";
            }
        }

        int mid = (int)(2 * a - 1) / 2;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < mid; j++) {
                str[i][j] = " ";
            }
            for(int j = mid - i; j < (mid-i) + 2*(i+1)-1; j++)  {
                str[i][j] = "*";
            }
        }
        for(int i = 0; i < a; i++) {
            System.out.println(String.join("", str[i]));
        }
    }
}
