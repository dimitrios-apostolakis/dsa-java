package datastructures.problems.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    //brute force: time comp O(n^2) | space comp O(n)
    public static int longestConsecutiveBF(int[] nums){
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

    //sorting: time comp O(nlogn) | space comp O(1) O(n)
    public static int longestConsecutiveS(int[] nums){
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;
        while (i<nums.length){
            if (curr != nums[i]){
                curr = nums[i];
                streak = 0;
            }

            while (i<nums.length && nums[i] == curr){
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,20,4,10,3,4,5};
        int[] nums2 = {0,3,2,5,4,6,1,1};
        int[] nums3 = {5,0,6,0,8};

        System.out.println("Brute force:");
        System.out.println(longestConsecutiveBF(nums));
        System.out.println(longestConsecutiveBF(nums2));
        System.out.println(longestConsecutiveBF(nums3));

        System.out.println("\nSorting:");
        System.out.println(longestConsecutiveS(nums));
        System.out.println(longestConsecutiveS(nums2));
        System.out.println(longestConsecutiveS(nums3));
    }
}
