package com.amit;

public class Patterns_using_Recursions
{
    public static void main(String[] args) {
        int row = 5;
        int col = 0;
        triangle(row,col);
        triangle2(row,col);
    }

    static void triangle2(int row,int col)
    {

        if(row==0)
        {
            return;
        }
        if(col<row)
        {

            triangle2(row,col+1);
            System.out.print("*");
        }
        else {

            triangle2(row-1,col=0);
            System.out.println();

        }
    }

    static void triangle(int r, int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            triangle(r,c+1);
        }
        else {
            System.out.println();
            triangle(r -1, 0);
        }
    }
}
