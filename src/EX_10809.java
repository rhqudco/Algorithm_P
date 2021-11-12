import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EX_10809 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        for (char ch = 'a'; ch <= 'z'; ch++)
            System.out.print(word.indexOf(ch) + " ");
    }
}