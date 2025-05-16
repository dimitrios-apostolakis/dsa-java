package datastructures.problems.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //brute force: time comp O(n^2) | space comp O(1)
    public static boolean containsDuplicateBF(int[] nums){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //sorting: time comp O(nlogn) | space comp O(1) or O(n)
    public static boolean containsDuplicateS(int[] nums){
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    //hash set: time comp O(n) | space comp O(n)
    public static boolean containsDuplicateHS(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for (int num : nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    //hash set length: time comp O(n) | space comp O(n)
    public static boolean containsDuplicateHSL(int[] nums){
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,2,3,4};
        System.out.println("BF: " + containsDuplicateBF(nums1));
        System.out.println("BF: " + containsDuplicateBF(nums2));
        System.out.println("Sorting: " + containsDuplicateS(nums1));
        System.out.println("Sorting: " + containsDuplicateS(nums2));
        System.out.println("Hash set: " + containsDuplicateHS(nums1));
        System.out.println("Hash set: " + containsDuplicateHS(nums2));
        System.out.println("Hash set length: " + containsDuplicateHSL(nums1));
        System.out.println("Hash set length: " + containsDuplicateHSL(nums2));
    }
}
