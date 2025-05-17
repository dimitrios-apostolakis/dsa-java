package datastructures.problems.arraysandhashing;

import java.util.*;

public class GroupAnagrams {

    //sorting: time comp O(m*nlogn) | space comp O(m*n)
    public static List<List<String>> groupAnagramsS(String[] strs){

        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] toCharArray = s.toCharArray();
            Arrays.sort(toCharArray);
            String strSorted = new String(toCharArray);
            res.putIfAbsent(strSorted, new ArrayList<>());
            res.get(strSorted).add(s);
        }
        return new ArrayList<>(res.values());
    }

    //hash table: time comp O(m*n) | space comp O(m*n)
    public static List<List<String>> groupAnagramsHT(String[] strs){

        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {

        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println("Sorting: " + groupAnagramsS(strs));
        System.out.println("Hash Table: " + groupAnagramsHT(strs));
    }
}
