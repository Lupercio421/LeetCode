package com.daniel.SearchInArray;

public class LinearSearchNAndDoubleSolution {
    public static boolean checkIfExist(int[] arr){
        if (arr == null || arr.length == 0){
            return false;
        };

        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i != j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = new int[]{10,2,5,3};
        int[] arrTwo = new int[]{3,1,7,11};
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist(arrTwo));
    }
}

