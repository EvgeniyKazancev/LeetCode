import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String s = " ";
        boolean result = vp.isPalindrome(s);
        System.out.println(result);
    }

    public boolean isPalindrome(String s) {
        String sl = s.toLowerCase();
        String revers = "" ;
        String reversSb ;

        if (s == " ") {
            return true;
        }
        for (int i = sl.length() - 1; i > -1; i--) {
            char c = sl.charAt(i);
            revers += c;
        }

        StringBuilder sb = new StringBuilder(revers);
        reversSb = sb.reverse().toString();
        if (revers.equals(reversSb) ) {
            return true;
        } else {
            return false;
        }

    }
}