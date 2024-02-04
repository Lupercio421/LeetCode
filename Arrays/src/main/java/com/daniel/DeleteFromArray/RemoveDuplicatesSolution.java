package com.daniel.DeleteFromArray;

public class RemoveDuplicatesSolution {

    public static int myAttempt(int[] nums){
        int i = 0;
        int k = nums.length;
        while (i < k){
            if (nums[i] < nums[k-1]){
                i++;
            }
            else{
                nums[i] = nums[k-1];
                k--;
            }
        }
        return nums.length;
    }
    /* First Index is responsible for writing unique values in our input array, while Second Index will read the input array and pass all the distinct elements to First Index.*/
    public static int removeDuplicates(int[] nums){
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++){
            //if we see a duplicate element, skip to the next index
            if (nums[i-1] != nums[i]){
                /*store the unique element at index, insertIndex. And increment insertIndex by 1*/
                nums[insertIndex] = nums[i];
                //insertIndex will be incremented with i
                insertIndex++;
            }
        }
        return insertIndex;
    }
    public static void main(String[] args){
        int[] testArray = new int[]{1,2,3,3,4};
        System.out.println("Algorithm solution: "+ removeDuplicates(testArray));
        int[] testArrayTwo = new int[]{1,2,3,3,4};
        System.out.println("My algorithm solution: "+ myAttempt(testArrayTwo));
    }
}
