package datastructures.problems.arraysandhashing;

import java.util.*;

public class TwoSum {

    //brute force: time comp O(n^2) | space comp O(1)
    public static int[] twoSumBF(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //sorting: time comp O(nlogn) | space comp O(n)
    public static int[] twoSumS(int[] nums, int target){
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]),
                        Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    //hash (two pass): time comp O(n) | space comp O(n)
    public static int[] twoSumM(int[] nums, int target){
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }

    //hash map(one pass): time comp O(n) | space comp O(n)
    public static int[] twoSumHM(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,5,6};
        int target1 = 7;
        int[] nums2 = {4,5,6};
        int target2 = 10;
        int[] nums3 = {5,5};
        int target3 = 10;
        int[] nums4 = {5,6};
        int target4 = 10;
        System.out.println("BF: " + Arrays.toString(twoSumBF(nums1, target1)));
        System.out.println("BF: " + Arrays.toString(twoSumBF(nums2, target2)));
        System.out.println("BF: " + Arrays.toString(twoSumBF(nums3, target3)));
        System.out.println("BF: " + Arrays.toString(twoSumBF(nums4, target4)));
        System.out.println("Sorting: " + Arrays.toString(twoSumS(nums1, target1)));
        System.out.println("Sorting: " + Arrays.toString(twoSumS(nums2, target2)));
        System.out.println("Sorting: " + Arrays.toString(twoSumS(nums3, target3)));
        System.out.println("Sorting: " + Arrays.toString(twoSumS(nums4, target4)));
        System.out.println("Map: " + Arrays.toString(twoSumM(nums1, target1)));
        System.out.println("Map: " + Arrays.toString(twoSumM(nums2, target2)));
        System.out.println("Map: " + Arrays.toString(twoSumM(nums3, target3)));
        System.out.println("Map: " + Arrays.toString(twoSumM(nums4, target4)));
        System.out.println("Hash Map: " + Arrays.toString(twoSumHM(nums1, target1)));
        System.out.println("Hash Map: " + Arrays.toString(twoSumHM(nums2, target2)));
        System.out.println("Hash Map: " + Arrays.toString(twoSumHM(nums3, target3)));
        System.out.println("Hash Map: " + Arrays.toString(twoSumHM(nums4, target4)));
    }
}
