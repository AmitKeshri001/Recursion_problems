package com.amit;

import java.util.*;

public class String_basic_questions_UsingRecursion {
    public static void main(String[] args) {
//        basic("", "bbasc");
//        System.out.println(basicList("" , "asbgdt"));
        System.out.println(basicNotarg("nhgaagys"));
    }

    static void basic(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a')
        {
            basic(p,up.substring(1));
        }

        else {
            basic(p+ch , up.substring(1));
        }
    }
    // agar tumko ArrayList return karna hai to niche code hai dekh lo ..
    static ArrayList<String> basicList(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        if(ch == 'a')
        {
            ans.addAll( basicList(p , up.substring(1)));
        }
        else
        {
            ans.addAll(basicList(p+ch , up.substring(1)));
        }
        return ans;
    }
//    agar manlo jo mera processed(p) hai usko agar ham arguments me na dale to kaise karenge niche code hai..

    static String basicNotarg( String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            return basicNotarg(up.substring(1));
        }
        else
        {
            return  ch + basicNotarg(up.substring(1));
        }
    }
}
