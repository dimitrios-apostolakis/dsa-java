package datastructures.problems.arraysandhashing;

import java.util.Arrays;

public class ProductExceptSelf {

    //brute force: time comp O(n^2) | space comp O(1), O(n)
    public static int[] productExceptSelf(int[] nums){
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }

    //division: time comp O(n) | space comp O(1), O(n)
    public static int[] productExceptSelfDiv(int[] nums) {
        int prod = 1, zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            } else {
                zeroCount++;
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                res[i] = (nums[i] == 0) ? prod : 0;
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }

    //Prefix & Suffix: time comp O(n) | space comp O(n)
    public static int[] productExceptSelfPS(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }

    //Prefix & Suffix Optimal: time comp O(n) | space comp O(1), O(n)
    public static int[] productExceptSelfPSO(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[] nums2 = {-1,0,1,2,3};
        int[] nums3 = {5,0,6,0,8};

        System.out.println("Brute force:");
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
        System.out.println(Arrays.toString(productExceptSelf(nums3)));

        System.out.println("\nDivision:");
        System.out.println(Arrays.toString(productExceptSelfDiv(nums)));
        System.out.println(Arrays.toString(productExceptSelfDiv(nums2)));
        System.out.println(Arrays.toString(productExceptSelfDiv(nums3)));

        System.out.println("\nPrefix & Suffix:");
        System.out.println(Arrays.toString(productExceptSelfPS(nums)));
        System.out.println(Arrays.toString(productExceptSelfPS(nums2)));
        System.out.println(Arrays.toString(productExceptSelfPS(nums3)));

        System.out.println("\nPrefix & Suffix Optimal:");
        System.out.println(Arrays.toString(productExceptSelfPSO(nums)));
        System.out.println(Arrays.toString(productExceptSelfPSO(nums2)));
        System.out.println(Arrays.toString(productExceptSelfPSO(nums3)));
    }


}
