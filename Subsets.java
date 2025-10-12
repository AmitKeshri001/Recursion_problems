package com.amit;

import java.util.ArrayList;

public class Subset_problems
{
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println(subsetList("","abc"));
//        System.out.println(subsetCount("" , "abc"));
        int[] arr = {1,2,3};
        System.out.println(IntSubsets(new ArrayList<Integer>() , arr , 0));
    }

    static void subset(String p, String up) {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
        return ;
    }

    static ArrayList<String> subsetList(String p, String up) {

        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsetList(p+ch,up.substring(1));
        ArrayList<String> right = subsetList(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static int subsetCount(String p, String up) {

        if(up.isEmpty())
        {

            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        count = count + subsetCount(p+ch,up.substring(1));
        count = count + subsetCount(p,up.substring(1));
        return count;
    }


//    agar bole ki kisi integer array ka subsets nikalna hai to uska code niche hai

    static ArrayList<ArrayList<Integer>> IntSubsets(ArrayList<Integer> ans , int[] arr , int index)
    {
        if(index == arr.length)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(ans));
            return list;
        }

        ArrayList<ArrayList<Integer>> left = IntSubsets(ans , arr , index+1);

        ans.add(arr[index]);
        ArrayList<ArrayList<Integer>> right = IntSubsets(ans , arr , index+1);
        ans.remove(ans.size()-1);

        left.addAll(right);


        return left;
    }

}
