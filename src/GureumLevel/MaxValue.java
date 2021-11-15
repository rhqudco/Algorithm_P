package GureumLevel;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        int cnt = 0;
        int input = 0;

        int a = scan.nextInt();

        for(int i = 1; i <= a; i++) {
            input = scan.nextInt();
            if(input > max) {
                max = input;
                cnt = i;
            }
        }
        System.out.printf("%d %d", max, cnt);
    }
}
