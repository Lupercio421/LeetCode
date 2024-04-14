package com.daniel.DeleteFromArray;

public class SecondRemoveDuplicatesSolution {

    public int removeDuplicates(int[] nums){
        int l = 1;
        for (int r = 1; r <= nums.length-1;r++){
            if (nums[r] != nums[r-1]){ //new unique
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}
