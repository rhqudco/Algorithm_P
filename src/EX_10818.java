import java.util.Scanner;

public class EX_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int min = 1000001;
        int max = -1000001;
        for(int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        System.out.print(min + " ");
        System.out.print(max);
    }
}
