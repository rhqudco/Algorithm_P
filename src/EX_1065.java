import java.util.Scanner;

public class EX_1065 {
    static int hansu (int num) {
        int cnt = 0;
        if(num < 100) {
            return num;
        }
        else {
            cnt = 99;
            if(num == 1000) {
                num = 999;
            }
            for(int i = 100; i <= num; i++) {
                int third = i/100; // 백의자리 숫자 구해줌
                int second = (i / 10) % 10; // 십의자리 숫자 구해줌
                int first = i % 10; // 일의자리 숫자 구해줌

                if((third - second) == (second - first)) {
                    //백의자리 - 십의자리가 십의자리 - 일의자리랑 같으면 등차를 가짐.
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(hansu(scan.nextInt()));
        scan.close();
    }
}
