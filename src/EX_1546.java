import java.util.Scanner;

public class EX_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] score = new double[num];
        double max = 0;
        double sum = 0;
        double avg = 0;
        for(int i = 0 ; i < num; i++) {
            score[i] = scan.nextInt();
            if(score[i] > max) max = score[i];
        }

        for(int i = 0; i < score.length; i++) {
            sum = sum + (score[i] / max * 100);
        }
        avg = sum/num;
        System.out.println(avg);
    }
}
