package com.amit;

public class From_1_to_n
{
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n)
    {
        if(n==0)
        {

            return;
        }


        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
