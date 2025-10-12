package com.amit;

import java.util.ArrayList;

public class LinearSearch_
{
    public static void main(String[] args) {
        int[] arr = {4,8,1,7,5,9,5,4,5};
        int target = 5;
        System.out.println(index(arr,target));
    }

    static ArrayList<Integer> index(int[] arr, int target)
    {
        int i=0;
        return helper(arr,target,i,new ArrayList<>());

    }
    // agar duplicates element bhi present hai and unko bhi arraylist
//    bna ke return karna hai to function ka return type bhi arraylist
//    hi hoga
    static ArrayList<Integer> helper(int[] arr, int target, int i,ArrayList<Integer> result)
    {
        if(i>arr.length-1)
        {
            return result;
        }
        if(arr[i]==target)
        {
            result.add(i);
        }

        return helper(arr,target,i+1, result);


    }
}
