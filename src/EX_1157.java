import java.util.Scanner;

public class EX_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toUpperCase();
        int[] chk = new int[26];
        int max = 0;
        int temp = 0;
        for(int i = 0; i < str.length(); i++) {
            chk[str.charAt(i) - 65]++;
        }
        for(int i = 0; i < chk.length; i++) {
            if(max < chk[i]) {
                max = chk[i];
                temp = i;
            }
        }
        for(int i = 0; i < chk.length; i++) {
            if(max == chk[i] && temp != i) {
                System.out.println("?");
                System.exit(0);
            }
        }
        System.out.printf("%c\n", temp+65);
    }
}
