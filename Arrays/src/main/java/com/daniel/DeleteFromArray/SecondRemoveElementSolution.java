package com.daniel.DeleteFromArray;

public class SecondRemoveElementSolution {

    /*
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
     */
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i <= nums.length-1; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] problemArray = new int[]{3,2,2,3};
        System.out.println(removeElement(problemArray,3));
    }
}
