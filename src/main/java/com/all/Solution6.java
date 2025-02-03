package com.all;

public class Solution6 {
    public static void main(String[] args) {


        Solution6 solution6 = new Solution6();
        String a = "1101";
        String b = "1001";
        String out = solution6.addBinary(a, b);
        System.out.println(out);
    }

    public String addBinary(String a, String b) {
       ;
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int aInt = aChar.length - 1;
        int bInt = bChar.length - 1;
        int result = 0;
        StringBuilder st = new StringBuilder();
         while (aInt >= 0 && bInt >= 0){
             int aa = aChar[aInt]- '0';
             int bb = bChar[bInt]- '0';
             int sum = aa + bb + result;
             result = sum/2;
             st.append(sum % 2);
            aInt--;
            bInt--;
         }
         while (aInt >= 0){
             int aa = aChar[aInt] - '0';
             int sum = aa + result;
             result = sum / 2 ;
             st.append(sum % 2);
             aInt--;
         }
        while (bInt >= 0){
            int bb = bChar[bInt] - '0';
            int sum = bb + result;
            result = sum / 2 ;
            st.append(sum % 2);
            bInt--;
        }
        if (result != 0){
            st.append(result);
        }

        return st.reverse().toString();

    }
}
