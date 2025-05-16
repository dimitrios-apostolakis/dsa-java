package datastructures.problems.arraysandhashing;

import java.util.*;

public class GroupAnagrams {

    //sorting: time comp O(m*nlogn) | space comp O(m*n)
    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] toCharArray = s.toCharArray();
            Arrays.sort(toCharArray);
            String strsSorted = new String(toCharArray);
            res.putIfAbsent(strsSorted, new ArrayList<>());
            res.get(strsSorted).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println("Sorting: " + groupAnagrams(strs));
    }
}
