package com.daniel.DeleteFromArray;

public class RemoveElementSolution {
    /*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.*/

    public int myAttempt(int[] nums, int val){
        int[] backUpArray;
        int valCount = 0;
        int p2 = nums.length-1;
        for (int p1 = 0; p1 < nums.length; p1++){
            if (nums[p1] == val){
                nums[p2] = nums[p1];
                valCount++;
                p2--;
            }
        }
        return 1;
    }

    public static int removeElement(int[] nums, int val){
        int i = 0; //slow runner pointer
        for (int j = 0; j < nums.length; j++){// j is the fast runner pointer
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    /* Aproach 2: Two Pointers - when elements to remove are rare*/

    public static int removeElementTwo(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while (i < n){
            if (nums[i] == val){
                // swap the current element with the last element
                nums[i] = nums[n-1];
                // reduce the array size by one
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args){
        int[] testArray = new int[]{1,2,3,2,5,9,2,5,4};
        System.out.println("First Algorithm solution: "+ removeElement(testArray, 5));
        int[] testArrayTwo = new int[]{1,2,3,2,5,9,2,5,4};
        System.out.println("Second Algorithm solution: "+ removeElementTwo(testArrayTwo,5));
    }
}

