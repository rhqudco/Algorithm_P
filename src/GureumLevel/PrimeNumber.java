package GureumLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

    public static boolean isPrime(int n ) {
        if(n < 2) return false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if(isPrime(input)) System.out.println("True");
        else System.out.println("False");
    }
}
