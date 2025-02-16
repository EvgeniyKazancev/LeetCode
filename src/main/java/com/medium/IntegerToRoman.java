package com.medium;

public class IntegerToRoman {
    public String intToRoman(int num) {
          String res = "";
          while (num > 0) {
              int rem = num % 10;
               num /= 10;
               res += "M";
            
          }


    }
}
