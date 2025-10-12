package com.amit;

import java.util.Arrays;

public class Merge_sort_using_Recursion
{
    public static void main(String[] args)
    {
        int[] arr = {4,1,5,2,3,7,6,8,12};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right)
    {
        int[] merge = new int[left.length+right.length];
        int i=0;int j=0;int k=0;
        while(i< left.length&&j< right.length)
        {
            if(left[i]<right[j])
            {
                merge[k]=left[i];
                i++;

            }
            else {
                merge[k]=right[j];
                j++;
            }
            k++;
        }
        while(i< left.length)
        {
            merge[k] = left[i];
            i++;
            k++;
        }
        while(j< right.length)
        {
            merge[k] = right[j];
            j++;
            k++;
        }

        return merge;

    }
}
