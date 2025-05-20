package datastructures.problems.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    //brute force: time comp O(n^2) | space comp O(n)
    public static int longestConsecutive(int[] nums){
        int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0, curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        int[] nums2 = {0,3,2,5,4,6,1,1};
        int[] nums3 = {5,0,6,0,8};

        System.out.println("Brute force:");
        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive(nums2));
        System.out.println(longestConsecutive(nums3));
    }
}
