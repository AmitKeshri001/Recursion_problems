package com.amit;

public class Tower_Of_Hanoi
{
    public static void main(String[] args) {
        int n = 3;
        int from = 1;
        int aux = 2;
        int dest = 3;
        System.out.println();
        System.out.println("No. of steps you will need to shift the rods is "+ " " + Hanoi(n,from,aux ,dest));
    }

    static int Hanoi(int n , int from , int aux , int dest)
    {
        if(n==1)
        {
            return 1;
        }
        System.out.println("your n-1 rod moves from" + from + "to" + aux);
        int move1 = Hanoi(n-1 , from , dest , aux);

        System.out.println("then your nth rod moves from" + from + "to" + dest);
        int move2 = 1;

        System.out.println("now your n-1 rods again moves from" + aux + "to" + dest);
        int move3 = Hanoi(n-1 , aux , from , dest);

        return move1+move2+move3;
    }


}
