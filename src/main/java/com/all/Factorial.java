package com.all;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n = 3;
        System.out.println(f.factorial(n));
    }
    public static int factorial(int n) {
        if(n == 0) return 0;
        if(n == 1){
            return n;
        }else {
            return n * factorial(n - 1);
        }
    }

}
