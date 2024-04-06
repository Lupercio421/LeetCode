package com.daniel.SearchInArray.ValidMountainArray;

public class Solution {

    public static boolean validMountainArray(int[] arr){
        int arrayLength = arr.length;
        int i = 0;
        int j = arrayLength-1;
        while(i+1 < arrayLength && arr[i] < arr[i+1]){
            i++;
        }
        while(j > 0 && arr[j-1] > arr[j]){
            j--;
        }
        return i > 0 && i==j && j < arrayLength-1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,5};
        System.out.println("Supposed to return true: " + validMountainArray(arr));
    }
}
