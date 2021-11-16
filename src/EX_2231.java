import java.util.Scanner;

public class EX_2231 {
    static int d (int n) {
        int q = n;
        int r = 0;

        int next = n;
        while(q != 0) {
            next += q % 10;
            q /= 10;
        }
        return next;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int tem = 0;
        for(int i = 0; i <= num; i++) {
            int next = d(i);
            if(next == num) {
                tem = i;
                break;
            }
        }
        System.out.println(tem);
    }
}
