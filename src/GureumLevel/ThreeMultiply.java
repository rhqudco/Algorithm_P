package GureumLevel;

import java.util.Scanner;

public class ThreeMultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i = 1; i <= input; i++) {
            if(i % 3 == 0) {
                System.out.print("X ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
