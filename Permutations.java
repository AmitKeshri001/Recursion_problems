package com.amit;

import java.sql.SQLOutput;
import java.util.*;

public class Permutations_Problems
{
    public static void main(String[] args) {
//        permute("","abc");
//        System.out.println(permuteList("" , "abc"));
//        System.out.println(permuteCount("","abc"));
        int[] arr = {1,2,3};
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> up = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            up.add(arr[i]);
        }
        System.out.println(permuteInt(p,up));
    }

    static void permute(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            permute(f+ch+s , up.substring(1));

        }
    }

//    agar arraylist bana ke return krna hua to .. code niche hai


    static ArrayList<String> permuteList(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++)
        {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permuteList(f+ch+s , up.substring(1)));
        }
        return ans;
    }

    static int permuteCount(String p , String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }

        int count =0;
        char ch = up.charAt(0);

        for(int i =0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            count = count + permuteCount(f+ch+s , up.substring(1));
        }

        return count;
    }

//    agar bole ki ek integer array diya hai ..uska nikalo permutaition ,, niche me code hai..

    static ArrayList<ArrayList<Integer>> permuteInt(ArrayList<Integer> p , ArrayList<Integer> up)
    {
        if(up.isEmpty())
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<up.size();i++)
        {
            int ch =  up.get(i);

            ArrayList<Integer> newP = new ArrayList<>(p);
            newP.add(ch);

            ArrayList<Integer> newUp = new ArrayList<>(up);
            newUp.remove(i);

            ans.addAll(permuteInt(newP,newUp));
        }
        return ans;

    }
}
