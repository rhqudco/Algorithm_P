package GureumLevel;

import java.util.Scanner;

public class ElectricCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int use = scan.nextInt();
        if(use < 100) {
            System.out.printf("%.2f", (float)use * 0.005);
        }
        else if(use >= 100 && use < 200) {
            System.out.printf("%.2f", (float)use * 0.007);
        }
        else if(use >= 200 && use < 300) {
            System.out.printf("%.2f", (float)use * 0.009);
        }
        else if(use >= 300) {
            System.out.printf("%.2f", (float)use * 0.01);
        }
    }
}
