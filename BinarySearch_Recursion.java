package com.amit;

public class Binary_search {
    public static void main(String[] args)
    {
        int[] arr={1,4,6,78,56,4,55,99};
        int target=99;
        int a= element(arr,target,0,arr.length-1);
        System.out.println(a);
    }

    static int element(int[] arr, int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start+(end-start)/2;
        if (target==arr[mid])
        {
            return mid;
        }
        if (target>arr[mid])
        {
            return element(arr,target,mid+1,end);
        }
        else
        {
            return element(arr,target,start,mid-1);
        }




    }
}