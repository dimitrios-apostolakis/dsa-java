package datastructures.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class ValidAnagram {

    //sorting: time comp O(nlogn + mlogm) | space comp O(1) or O(n+m)
    public static boolean isAnagramS(String s, String t){
        if (s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }

    //hash map: time comp O(n + m) | space comp O(1) because 26 chars
    public static boolean isAnagramHM(String s, String t){
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);
    }

    //array: time comp O(n + m) | space comp O(1) because 26 chars
    public static boolean isAnagramA(String s, String t){
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count){
            if (val != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println("Sorting: " + isAnagramS(s,t));
        System.out.println("Hash Map: " + isAnagramHM(s,t));
        System.out.println("Array: " + isAnagramA(s,t));
    }
}
