import java.sql.Array;

public class PalindromeNum {


    public boolean isPalindrome(int x) {
         boolean palindrome = false;
         String number = String.valueOf(x);
         String[] arr = number.split(",");
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == number.charAt(number.length() - i - 1) ){
                palindrome = true;
            }else {
                palindrome = false;
            }
        }
        return palindrome;
    }

}
