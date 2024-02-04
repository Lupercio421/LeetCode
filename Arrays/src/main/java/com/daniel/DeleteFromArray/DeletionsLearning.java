package com.daniel.DeleteFromArray;

public class DeletionsLearning {
    public static void main(String[] args){
        // Declare an integer array of 10 elements.
        int[] intArray = new int[10];

// The array currently contains 0 elements
        int length = 0;

// Add elements at the first 6 indexes of the Array.
        for(int i = 0; i < 6; i++) {
            intArray[length] = i;
            System.out.println("Adding to length++: "+ length++);
        }
        //deletion from the end also reduces the length of the array by 1
        System.out.println("Removing the array with length--: " + length--);
//        length--;
        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        for (int i = 1; i < length; i++){
            intArray[i-1] = intArray[i];
        }
        System.out.println("Removing the array with length--");
        length--;
        System.out.println("Deletion logic");
        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
        /*Say we want to delete the element at index 1*/
        for (int i = 2; i < length; i++){
            intArray[i -1] = intArray[i];
        }
        System.out.println("Removing the array with length--");
        length--;
        System.out.println("Post deletion at index 1 logic");
        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
