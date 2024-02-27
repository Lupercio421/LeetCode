package com.daniel.DeleteFromArray;

public class DeleteFromSortedArray {

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
    public int removeDuplicates(int[] nums){
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
}
