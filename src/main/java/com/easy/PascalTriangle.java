package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));

            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
