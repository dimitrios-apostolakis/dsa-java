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

    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        int[] nums2 = {-1,0,1,2,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }


}
