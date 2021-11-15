package GureumLevel;

import java.util.Scanner;

public class NarcissisticNumber {
    static boolean isNarcissistic(int n) {
        int q = n;
        int r = 0;
        int num = 0;
        while(q != 0) {
            r = q % 10;
            q = (int)(q / 10);
            num += Math.pow(r, 3);
        }
        return num == n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = a; i <= b; i++) {
            boolean ret = isNarcissistic(i);
            if(ret) System.out.printf("%d ", i);
        }
    }
}
