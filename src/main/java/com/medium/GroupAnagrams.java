package com.medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans = new ArrayList<>();
       if (strs == null || strs.length == 0) return ans;
       Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
         char[] chars = str.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(str);


       }
       ans.addAll(map.values());
       return ans;
    }
}
