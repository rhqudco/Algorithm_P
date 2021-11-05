import java.io.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        scan.close();

        if(minute < 45) {
            hour -= 1;
            if (hour < 0 ) {
                hour = 23;
            }
            minute = 60 - (45 - minute);

            System.out.println(hour + " " + minute);
        }
        else {
            minute -= 45;
            System.out.println(hour + " " + minute);
        }
    }
}
