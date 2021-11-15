package GureumLevel;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        if(a < 0 ) System.out.println(-a);
        else System.out.println(a);
    }
}
