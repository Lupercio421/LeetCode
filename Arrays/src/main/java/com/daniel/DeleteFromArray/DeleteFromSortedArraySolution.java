package com.daniel.DeleteFromArray;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Objects;

public class DeleteFromSortedArraySolution {

    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */
//    public int removeDuplicates(int[] nums){
//        int uniqueValueCount = 0;
//        int numsLength = nums.length-1;
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] != nums[uniqueValueCount]){
//                nums[uniqueValueCount++] = nums[i];
//            }
//            return uniqueValueCount++;
//        }
    // Time: O(N), Space: O(1)
//    }
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int insertIndex = 1;
        if (n == 0){
            return 0;
        }
        for (int i = 1; i < n; i++){
            if (nums[i] != nums[i-1]){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main(String[] args){
        int[] testArray = new int[]{1,1,2,3,5};
        System.out.println("Should return 4: " + removeDuplicates(testArray));
        HashMap<String, Object> testMap = new HashMap<>();
        testMap.put("aa",removeDuplicates(testArray));
        System.out.println("What is the test map: " + testMap);
    }
}
