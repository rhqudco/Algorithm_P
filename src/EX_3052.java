import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class EX_3052 {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[42];
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        for(boolean check : arr) {
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}