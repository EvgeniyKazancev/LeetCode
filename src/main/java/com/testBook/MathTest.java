package com.testBook;

import java.util.Arrays;

public class MathTest {
    public static void main(String[] args) {
        double a = 4;
        double x = Math.sqrt(a);
        double y = Math.pow(4, 2);

        int w = 0;

        int res = 1000000000 * 2;
        int n = 5;
      String test = "   Hello ";
      int  index = test.offsetByCodePoints(0,4);
      int[] cp = test.codePoints().toArray(); // преобразует строку в массив точек
      String r = new String(cp,0,cp.length);// преобразует массив в строку
        System.out.println(Arrays.toString(cp));
        System.out.println(r);
      int len = test.codePointCount(0,test.length());
         w = 2 * n--;
        System.out.println("\u1080");
        //System.out.println(n);

        int in = test.indexOf("He");
        String tt = "hello";
        StringBuilder stringBuilder = new StringBuilder();
        boolean t = test.equalsIgnoreCase(tt);
        System.out.println(in);
        System.out.println(t);
        System.out.println(test.length());
        System.out.println(test.substring(0,2));
        System.out.println(test.toLowerCase());
        System.out.println(tt.toUpperCase().length());
        System.out.println(test.strip().toUpperCase());
        System.out.println(test.repeat(10).trim().toUpperCase());

        stringBuilder.append(test);
        stringBuilder.append(tt);
        stringBuilder.append(t);
stringBuilder.append("www");
stringBuilder.setCharAt(5,'T');
stringBuilder.delete(0,3);
        String ss = stringBuilder.toString();
        System.out.println(stringBuilder);
    }
}
