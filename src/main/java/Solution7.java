public class Solution7 {
    public static void main(String[] args) {
        var fibonacci = new Solution7();
        System.out.println(fibonacci.climbStairs(6));
    }


    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0 || n > 92) {

            throw new IndexOutOfBoundsException(n);
        }
        int n0 = 1;
        int n1 = 1;

        for (int i = 2; i <= n; i++) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }
}
