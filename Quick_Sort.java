package com.amit;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[] arr = {40,10,25,47,31,11,13};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr)
    {
        int low = 0;
        int high = arr.length-1;
        helper(arr, low, high);
    }

    static void helper(int[] arr, int low, int high)
    {
        if(low>=high)
        {
            return;

        }
        int start=low;
        int end = high;
        int mid = start +(end-start)/2;
        int pivot = arr[mid];

        while(start<=end)
        {
            while(arr[start]<pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }

            if(start<=end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        helper(arr,low,end);
        helper(arr,start,high);
    }
}

/* Differences Between Quick Sort  AND   Merge Sort is :---
   merge sort --> 1. Stable
                  2. Not Inplace(mean --> isme extra space lagega)
                  3. Time complexity = O(nlog n)
                  4. agar arr pehle se sorted hoga to Quick Sort kabhi bhi use mat karna
                     usme uska worst case time compl aaajata hai i.e. O(n^2)
   Quick sort --> 1. Un Stable
                  2. Inplace Sorting algo hai (bubble, selection,insertion)
                  3. Time complexity = O(nlog n) (best and avg dono hai)
                  4. worst case tab ho ta hai jab arr pehle se sorted ho (asc/desc) = O(n^2)


            ((( Quick sort is better than the merge sort because in this no extra space is being used)))
            (((agar array partially sorted ho tab tum Insertion sort ka use kiya jata hai)))
            (((Java me inbuild jo hote hai sorting function (Arrays.sort()) unme Merge sort + insertion sort
                use hota hai)))....


 */
