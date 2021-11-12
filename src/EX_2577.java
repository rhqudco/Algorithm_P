import java.util.Arrays;
import java.util.Scanner;

public class EX_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int num = 0;

        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        num = a * b * c;
        String str = Integer.toString(num);
        String[] arr = str.split("");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0")) num0++;
            if(arr[i].equals("1")) num1++;
            if(arr[i].equals("2")) num2++;
            if(arr[i].equals("3")) num3++;
            if(arr[i].equals("4")) num4++;
            if(arr[i].equals("5")) num5++;
            if(arr[i].equals("6")) num6++;
            if(arr[i].equals("7")) num7++;
            if(arr[i].equals("8")) num8++;
            if(arr[i].equals("9")) num9++;
        }
        System.out.println(num0);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);

    }
}
