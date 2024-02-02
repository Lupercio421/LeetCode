package com.daniel.InsertIntoArray;

public class DuplicateZerosSolution {
    public static int[] duplicateZeros(int[] arr) throws IndexOutOfBoundsException{
        int possibleDups = 0;
        int length_ = arr.length-1;
        for (int left = 0; left <= length_-possibleDups; left++){
            // Count the zeros
            if (arr[left] == 0){
                // edge case: this zero can't be duplicated, as there is no more space
                if (left == length_ - possibleDups){
                    // for this zero/edege case, we will copy it without duplication
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // start backwards from the last element which would be part of new array

        int last = length_ - possibleDups;

        // copy the zero twice and the non-zero once

        for (int i = last; i >= 0; i--){
            if (arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            }
            else {
                arr[i + possibleDups] = arr[i];
            }
        }
//        for (int i =0; i < arr.length; i++){
//            if (arr[i] == 0){
//                arr[i+1] = 0;
//            }
//            else{
//                throw new IndexOutOfBoundsException("Our method has failed, possible Index out of bounds");
//            }
//
//            // Find the number of zeros to be duplicated
//            // Stopping when left points beyond the last element in the original array
//            // which would be part of the modified array
//        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{1,3,0,1};
//        How do we find out how many elements would be discarded in the end? The number would be equal to the number of extra zeros which would be added to the array.
        System.out.println(duplicateZeros(arr1));
    }
}