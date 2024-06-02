package org.practice.DynamicArrays;

public class ConcatenateArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ansArray = new int[nums.length*2];
        for (int i = 0; i < ansArray.length; i++){
            System.out.println("What i % nums.length?: " + i % nums.length);
            System.out.println("What nums[i % nums.length]?: " + nums[i % nums.length]);
            ansArray[i] = nums[i % nums.length];
        }
        return ansArray;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        getConcatenation(nums);
    }
}
