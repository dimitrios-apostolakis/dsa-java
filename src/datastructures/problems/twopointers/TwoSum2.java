package datastructures.problems.twopointers;

import java.util.Arrays;

public class TwoSum2 {

    //brute force: time comp O(n^2) | space comp O(1)
    public static int[] twoSumBF(int[] nums, int target) {
        for (int i=0; i<nums.length-1; i++){
            for (int j = i+1; j< nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4};
        int target1 = 3;
        int[] numbers2 = {1,2,3,4};
        int target2 = 4;
        System.out.println("Array:" + Arrays.toString(twoSumBF(numbers1, target1)));
        System.out.println("Array:" + Arrays.toString(twoSumBF(numbers2, target2)));
    }
}
