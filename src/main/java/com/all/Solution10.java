package com.all;

public class Solution10 {
    public static void main(String[] args) {
        Solution10 sss = new Solution10();
        String s = "ABFCACDB";
        sss.minLength(s);
        System.out.println(sss.toString());
    }

    public int minLength(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int result = s.length();

        // ���� ������ s �������� AB ��� CD, ���������� �������� ��������
        while (s.contains("AB") || s.contains("CD")) {
            StringBuilder sb = new StringBuilder();

            // ���������� �� ������ � ������� ��� ��������� AB � CD
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (i < s.length() - 1 && (s.substring(i, i + 2).equals("AB") || s.substring(i, i + 2).equals("CD"))) {
                    i++; // ���������� ��� �������, ���� ��� AB ��� CD
                } else {
                    sb.append(c); // ��������� ������� ������ � ����� ������
                }
            }

            // ��������� ������ s � ���������
            s = sb.toString();
            result = Math.min(result, s.length());
        }

        return result;
    }
}
