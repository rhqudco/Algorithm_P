package GureumLevel;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        float avg = (float)(a+b+c)/3;



        if(avg >= 90) {
            System.out.printf("%.2f A", avg);
        }
        else if(avg < 90 && avg >= 80) {
            System.out.printf("%.2f B", avg);
        }
        else if(avg < 80 && avg >= 70)  {
            System.out.printf("%.2f C", avg);
        }
        else if(avg < 70 && avg >= 60) {
            System.out.printf("%.2f D", avg);
        }
        else if(avg < 60) {
            System.out.printf("%.2f F", avg);
        }
    }
}
