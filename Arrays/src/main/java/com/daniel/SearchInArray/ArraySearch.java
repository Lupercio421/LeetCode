package com.daniel.SearchInArray;

import static com.daniel.SearchInArray.SearchInArrayLesson.linearSearch;

public class ArraySearch{
    public static void main(String args[]){
        int[] array = new int[6];

        //var to keep track of the length of the array
        int length = 0;

        // iterate through the 6 indexes of the array
        for (int i = 0; i < 6; i++){
            array[length++] = i;
        }
        System.out.println("Does the array contain the element 4? - " + linearSearch(array, length, 4));
        System.out.println("Does the array contain the element 30? - " + linearSearch(array, length, 30));
    }
}