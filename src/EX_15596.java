public class EX_15596 {
    static long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        sum(a);
        System.out.println(sum(a));
    }
}
