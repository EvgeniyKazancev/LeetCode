import java.sql.Array;

public class PalindromeNum {


    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

         if (x <= 9){
             return true;
         }
         String number = String.valueOf(x);
         int n = number.length();

        for (int i = 0; i < n/2; i++) {

            if (number.charAt(i) != number.charAt(n - i - 1) )
                return false;
        }
            return true;



    }

}
