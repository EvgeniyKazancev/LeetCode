package com.all;

public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings bs = new BuddyStrings();
        String s = "abcaa";
        String goal = "abcbb";
        boolean result = bs.buddyStrings(s, goal);
        System.out.println(result);
    }

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int diffCount = 0;
        int[] diffIndexes = new int[2];
           int[] ints = new int[150];
        for (int i = 0; i < s.length(); i++) {
            ints[(int) s.charAt(i)]++;
            if ( ints[(int) s.charAt(i)] == 2){
                return true;
            }
            if (s.charAt(i) != goal.charAt(i)) {
                
                diffCount++;

                if (diffCount > 2) {
                    return false;
                }

                diffIndexes[diffCount - 1] = i;
            }
        }
        if (diffCount != 2) {
            return false;
        }

        return s.charAt(diffIndexes[0]) == goal.charAt(diffIndexes[1]) &&
                s.charAt(diffIndexes[1]) == goal.charAt(diffIndexes[0]);
    }

//        if (s.length() != goal.length()) {
//            return false;
//        }
//
//        String res = "";
//        StringBuilder sb = new StringBuilder();
//        StringBuilder uni = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != goal.charAt(i)) {
//                uni.append(s.charAt(i));
//
//            } else
//                sb.append(s.charAt(i));
//        }
//        System.out.println(uni);
//        System.out.println(sb);
//        if (uni.isEmpty()) {
//            sb.reverse();
//        }
//        res = sb.toString();
//        res += String.valueOf(uni.reverse());
//        if (res.equals(goal)) {
//            return true;
//        } else
//            return false;
//    }
}
