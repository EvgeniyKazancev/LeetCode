public class ReversInt {
    public static void main(String[] args) {
        ReversInt ri = new ReversInt();
        int x = -120;
        int r = ri.reverse(x);
        System.out.println(r);
    }

    public int reverse(int x) {
        String rev = String.valueOf(x);
        StringBuilder sb = new StringBuilder(rev);
        sb.reverse();
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        String revers = sb.toString();
        try {
            return Integer.parseInt(revers);
        } catch (Exception e) {
            return 0;
        }
    }
}

