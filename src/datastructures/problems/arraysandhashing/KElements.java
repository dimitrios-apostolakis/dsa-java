package datastructures.problems.arraysandhashing;

import java.util.*;

public class KElements {

    //sorting: time comp O(nlogn) | space comp O(n)
    public static int[] kElementsS(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i=0; i<k; i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }



    public static void main(String[] args) {

        int[] nums = {1,7,7,4,4,4};
        int k = 2;
        System.out.println("Sorting: " + Arrays.toString(kElementsS(nums, k)));
    }
}
