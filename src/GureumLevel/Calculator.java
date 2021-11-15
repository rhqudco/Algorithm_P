package GureumLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        if(op.equals("+")) {
            System.out.println(a+b);
        }
        else if(op.equals("-")) {
            System.out.println(a-b);
        }
        else if(op.equals("*")) {
            System.out.println(a*b);
        }
        else if(op.equals("/")) {
            System.out.printf("%.2f", (float)a/b);
        }
    }
}
