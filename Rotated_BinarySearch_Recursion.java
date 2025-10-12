package com.amit;

public class Binary_Search_recursion
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,7,1,6,8,3,9,1,7};
        int target = 9;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }

    static int search(int[] arr, int target,int s,int e)
    {
        int m = s+(e-s)/2;
        if(s>e)
        {
            return -1;

        }
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(target>=arr[s]&&target<=arr[m])
            {
                return search(arr,target,s,m-1);

            }
            else {
                return  search(arr,target,m+1,e);
            }
        }
        if(target>=arr[m]&&target<=arr[e])
        {
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
