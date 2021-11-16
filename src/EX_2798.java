import java.util.Scanner;

public class EX_2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int card = scan.nextInt();
        int gameNum = scan.nextInt();
        int chk = 0;
        int[] arr = new int[card];

        for(int i = 0; i < card; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < card - 2; i++) {
            for(int j = i + 1; j < card - 1; j++) {
                for(int k = j + 1; k < card; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if(gameNum == temp) {
                        System.out.println(temp);
                        System.exit(0);
                    }
                    if(chk < temp && temp < gameNum) {
                        chk = temp;
                    }
                }
            }
        }
        System.out.println(chk);
    }
}
