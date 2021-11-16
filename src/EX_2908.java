import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EX_2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[2];

        for(int i = 0; i < str.length; i++) {
            str[i] = scan.next();
        }
        StringBuffer sb = new StringBuffer(str[0]);
        StringBuffer sb2 = new StringBuffer(str[1]);
        String rstr1 = sb.reverse().toString();
        String rstr2 = sb2.reverse().toString();

        int x1 = Integer.parseInt(rstr1);
        int x2 = Integer.parseInt(rstr2);

        if(x1 > x2) System.out.println(x1);
        if(x2 > x1) System.out.println(x2);
    }
}
