package datastructures.problems.arraysandhashing;

import java.util.*;

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

    //hash set: time comp O(n) | space comp O(n)
    public static int longestConsecutiveHS(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums){
            numSet.add(num);
        }
        int longest = 0;
        for (int num : numSet){
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    //hash map: time comp O(n) | space comp O(n)
    public static int longestConsecutiveHM(int[] nums){
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        for (int num : nums){
            if (!mp.containsKey(num)){
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
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

        System.out.println("\nHash Set:");
        System.out.println(longestConsecutiveHS(nums));
        System.out.println(longestConsecutiveHS(nums2));
        System.out.println(longestConsecutiveHS(nums3));

        System.out.println("\nHash Map:");
        System.out.println(longestConsecutiveHM(nums));
        System.out.println(longestConsecutiveHM(nums2));
        System.out.println(longestConsecutiveHM(nums3));
    }
}
