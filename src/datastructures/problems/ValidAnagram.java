package datastructures.problems;

import java.util.Arrays;

public class ValidAnagram {

    //sorting: time comp O(nlogn + mlogm) | space comp O(1) or O(n+m)
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s,t));
    }
}
