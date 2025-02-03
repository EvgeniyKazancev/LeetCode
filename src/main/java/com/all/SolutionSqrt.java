package com.all;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SolutionSqrt {
    public static void main(String[] args) {
        SolutionSqrt solutionSqrt = new SolutionSqrt();
        int result = solutionSqrt.mySqrt(1000);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        double y = Math.sqrt(x);
        int sqrt;


        double newDouble = new BigDecimal(y).setScale(3, RoundingMode.DOWN).doubleValue();
        sqrt = (int) newDouble;
        return sqrt;

    }
}
