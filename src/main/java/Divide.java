public class Divide {
    public static void main(String[] args) {
        int devid = -2147483648;
        int divis = -1;
        Divide de = new Divide();
        System.out.println(de.divide(devid,divis));
    }
    public int divide(int dividend, int divisor) {
          int result = dividend / divisor;
        return   result;

    }
}
