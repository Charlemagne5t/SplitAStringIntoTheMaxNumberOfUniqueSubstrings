package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxUniqueSplit(String s) {
        return dfs(s, 0, new HashSet<>(), "");
    }
    int dfs(String s, int i, Set<String> used, String curStr ) {
        if(i == s.length()) {
           return (used.contains(curStr) || curStr.isEmpty()) ? 0 : used.size() + 1;
        }
        int add = dfs(s, i + 1, used, curStr + s.charAt(i));
        int endHere = 0;
        if(!curStr.isEmpty() && !used.contains(curStr)){
            used.add(curStr);
            endHere = dfs(s, i + 1, used, "" + s.charAt(i));
            used.remove(curStr);
        }


        return Math.max(add, endHere);
    }
}