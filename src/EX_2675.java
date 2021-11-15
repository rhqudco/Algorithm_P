import java.io.IOException;
import java.util.Scanner;

public class EX_2675 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine() );

        for(int i = 0; i < n; i++ ) {
            String [] temp = sc.nextLine().split(" ");
            int repeat = Integer.parseInt( temp[0] );
            String str = temp[1];

            for(char ch : str.toCharArray() ) {
                for(int j = 0; j < repeat; j++ ) {
                    System.out.printf("%c", ch);
                }
            }
            System.out.println();
        }
    }
}
