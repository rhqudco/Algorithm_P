package GureumLevel;

import java.util.Scanner;

public class LegoBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int lmax = 0;
        int lcnt = 0;
        int rcnt = 0;
        int rmax = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        lmax = arr[0];
        lcnt++;
        for(int i = 1; i < num; i++) {
            if(arr[i] > lmax) {
                lmax = arr[i];
                lcnt++;
            }
        }
        rmax = arr[num-1];
        rcnt++;
        for(int i = num-2; i >= 0; i--) {
            if(arr[i] > rmax) {
                rmax = arr[i];
                rcnt++;
            }
        }
        System.out.printf("%d %d", lcnt, rcnt);
    }
}
