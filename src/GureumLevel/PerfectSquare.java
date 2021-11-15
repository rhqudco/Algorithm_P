package GureumLevel;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] arr = new int[input];
        int cnt = 0;

        for(int i = 0; i < input; i++) {
            arr[i] = scan.nextInt();
            if(arr[i] % Math.sqrt(arr[i]) == 0) {
             cnt++;
            }
        }
        System.out.println(cnt);
    }
}
