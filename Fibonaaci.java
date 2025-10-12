package com.amit;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int a = fibo(n);
        System.out.println(a);
    }

    static int fibo(int n)
    {
        if(n==0)
            return 0;
        if (n==1)
            return 1;
        return fibo(n-1)+fibo(n-2);

    }
}

