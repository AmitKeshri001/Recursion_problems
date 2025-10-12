package com.amit;

public class Weather_an_Array_isSortedOrNot
{
    public static void main(String[] args) {
        int[] arr = {4,5,9,12,16,24};
        System.out.println(check(arr));

    }

    static boolean check(int[] arr)
    {
        int i=0;
        return helper(arr,i);

    }

    static boolean helper(int[] arr, int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if (arr[i+1]>arr[i])
        {
            return helper(arr,i+1);


        }
        else
            return false;

    }
}
