public class Solution6 {
    public static void main(String[] args) {


        Solution6 solution6 = new Solution6();
        String a = "1110010";
        String b = "101010";
        String out = solution6.addBinary(a, b);
        System.out.println(out);
    }

    public String addBinary(String a, String b) {

        String resInt = Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        return resInt;
    }
}
