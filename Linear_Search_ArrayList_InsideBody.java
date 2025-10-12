package com.amit;

import java.util.ArrayList;

public class LinearSearch_but_ArrayList_in_body
{
    public static void main(String[] args) {
        int[] arr = {4,8,1,7,5,9,5,4,5};
        int target = 5;
        System.out.println(index(arr,target,0));
    }

    static ArrayList<Integer> index(int[] arr,int target,int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length)
        {

            return list;
        }
        if(arr[i] == target)
        {
            list.add(i);
        }
        ArrayList<Integer> Below = index(arr,target,i+1);

        list.addAll(Below);

        return list;
    }
}
