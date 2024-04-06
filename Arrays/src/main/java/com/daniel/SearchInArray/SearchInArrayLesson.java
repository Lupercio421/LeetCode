package com.daniel.SearchInArray;

public class SearchInArrayLesson {
    public static boolean linearSearch(int[] array, int length, int element){
        // Check for edge cases. Is the array null or empty?
        // If it is, then we return false because the element we're
        // searching for couldn't possibly be in it.
        if (array == null || length == 0){
            return false;
        }

        //carry out the linear search by checking each element
        for (int i = 0; i < length; i++){
            //we found the element at index i. So we return true to say it exists

            if (array[i] == element){
                return true;
            }
        }

        //we didnt find the element in the array
        return false;
    }

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
        }
    }
}
