package com.all;

public class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String s = "   fly me   to   the moon  ";
        int result = solution4.lengthOfLastWord(s);
        System.out.println(result);
    }

    public int lengthOfLastWord(String s) {
        String[] index = s.split(" ");
        int count = (index[index.length - 1].trim().length());
        return count;
    }
}