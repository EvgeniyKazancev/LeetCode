package com.all;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
        RomantoInteger rt = new RomantoInteger();
        String s = "IIIII";
        int rrr =  rt.romanToInt(s);
        System.out.println(rrr);
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = map.get(s.charAt(i));
            int nextValue = (i < s.length() - 1) ? map.get(s.charAt(i + 1)) : 0;
            if (currentValue < nextValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}
