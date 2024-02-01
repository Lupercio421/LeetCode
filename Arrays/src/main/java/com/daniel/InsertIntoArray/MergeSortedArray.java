package com.daniel.InsertIntoArray;

public class MergeSortedArray {
//    Problem 88. Merge Sorted Array
    /*
    * Approach 2: Three Pointers (Start From the Beginning)
    * Make a copy of the two values in nums1, nums1Copy, and then use two read pointers and one
    * write pointer to read from nums1Copy and nums2, and write them into nums1
    * */
    public void merge(int[] nums1, int m, int[] nums2, int n){
        // create the nums1 copy
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++){
            nums1Copy[i] = nums1[i];
        }

        // initialize pointers for nums1copy and nums2
        int p1 = 0;
        int p2 = 0;

        for(int p = 0; p < m + n; p++){
            // need to ensure that p1 and p2 aren't over the boundaries
            if (p2 > n || (p1 < m && nums1Copy[p1] < nums2[p2])){
                nums1[p] = nums1Copy[p1++];
            }
            else{
                nums1[p] = nums2[p2++];
            }
        }

    }

    /*
     * Approach 3: Three Pointers (Start From the End)
     * */

    public void merge2(int[] nums1, int m, int[] nums2, int n){
        // set p1 and p2 to point to the end of their respective arrays

        int p1 = m-1;
        int p2 = n-1;

        // move p backward through the array, each time writing the smalles value point at by p1 or p2

        for (int p = m + n - 1; p >= 0; p--){
            if (p2 < 0){
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }
            else{
                nums1[p] = nums2[p2--];
            }
        }
    }

    /*Alternative solution*/
    public void merge4(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        for(int i = nums1.length - 1; i >= 0; i--) {
            if(p1 >= 0 && p2 >= 0) {
                nums1[i] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            } else if (p1 >= 0) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
}
