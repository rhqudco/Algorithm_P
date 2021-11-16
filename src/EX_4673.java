import java.util.ArrayList;

public class EX_4673 {
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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for( int i = 1; i <= 10000; i++) {
            nums.add(d(i));
        }
        for(int i = 1; i <= 10000; i++) {
            if(!nums.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
