package com.amit;

public class Sum_of_digits
{
    public static void main(String[] args) {
        int n =91343;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if(n==0)
        {
            return 0;
        }
        int s = n%10;
        return s+sum(n/10);
    }
}
