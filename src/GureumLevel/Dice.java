package GureumLevel;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dice = scan.nextInt();

        for(int i = 1; i <= 6; i++) {
            for(int j =6; j > 0; j--)  {
                if(i + j == dice) {
                    System.out.printf("%d %d\n", i ,j);
                }
            }
        }
    }
}
