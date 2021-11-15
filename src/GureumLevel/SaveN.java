package GureumLevel;

import java.util.Scanner;

public class SaveN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int ans = 0;
        for(int i = 1; i < num; i++) {
            sum = sum + i;
            if(sum >= num) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
