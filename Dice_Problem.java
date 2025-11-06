package com.amit;

import java.util.ArrayList;

public class Dice_Problem
{
    public static void main(String[] args) {
        dice("",5);
        System.out.println(dicelist("" , 5));
        System.out.println(diceCount("",5));
    }

    static void dice(String p , int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target;i++)
        {
            dice(p+i,target-i);
        }
    }

//    agar tumko arraylist me return karna hai to .. code niche hai..

    static ArrayList<String> dicelist(String p , int target)
    {
        if(target==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1;i<=6 && i<=target ; i++)
        {
            ans.addAll(dicelist(p+i , target-i));
        }
        return ans;


//        agar count bhi nikalna hua to .. niche code hai

    }

    static int diceCount(String p , int target)
    {
        if(target==0)
        {
            return 1;
        }
        int count =0;

        for(int i=1;i<=6 && i<=target; i++)
        {
            count = count + diceCount(p+i , target-i);
        }
        return count;
    }
}
z