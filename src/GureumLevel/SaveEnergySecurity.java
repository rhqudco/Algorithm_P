package GureumLevel;

import java.util.Scanner;

public class SaveEnergySecurity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int in = scan.nextInt();
        for(int i = 1; i <= in; i++) {
            if(in % i == 0) {
                cnt++;
            }
        }
        if(cnt % 2 == 0) System.out.println("no");
        else System.out.println("yes");
    }
}
