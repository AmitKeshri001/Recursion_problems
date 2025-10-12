package com.amit;

public class Reverse_aNumberUsing_Recursion
{
    static int sum= 0;
    public static void main(String[] args) {
        int n=473438;
        reverse(n);
        System.out.println(sum);
    }

    private static void reverse(int n) {

        if(n==0)

        {
            return;
        }
        int remain = n%10;
        sum = sum*10+remain;
        reverse(n/10);


    }
}
