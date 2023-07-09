public class ReversInt {
    public static void main(String[] args) {
        ReversInt ri = new ReversInt();
        int x = 2000000000;
        System.out.println(System.currentTimeMillis());
        int r = ri.reverse(x);
        System.out.println(System.currentTimeMillis());
        System.out.println(r);
    }

    public int reverse(int x) {


        String rev = String.valueOf(x);
        System.out.println(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder(rev);
        System.out.println(System.currentTimeMillis());
        sb.reverse();
        System.out.println(System.currentTimeMillis());
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        System.out.println(System.currentTimeMillis());
        String revers = sb.toString();
        System.out.println(System.currentTimeMillis());
        try {
            return Integer.parseInt(revers);
        } catch (Exception e) {
            return 0;
        }
    }
}

