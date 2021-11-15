package GureumLevel;

import java.util.Scanner;

public class SumofDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
