package com.amit;

public class Sum_from_n_to_1
{
    public static void main(String[] args) {
        int s = sum(5);
        System.out.println(s);
    }

    private static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }
}
