package com.amit;

import java.util.ArrayList;

public class Maze_Problems
{
    public static void main(String[] args)
    {
        System.out.println(CountPath(3,3));
        path("",3,3);
        System.out.println(pathlist("",3,3));
        System.out.println(diagpath("" , 3,3));
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        Obstecals("" , maze , maze.length-1,maze[0].length-1);

    }

    static int CountPath(int r , int c)
    {
        if(r==1 || c ==1)
        {
            return 1;
        }

        int left =   CountPath(r-1,c);

        int right =   CountPath(r,c-1);

        return left+right;

    }

    static void path(String p , int r , int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            path(p+'D' ,r-1 , c);
        }

        if(c>1)
        {
            path(p+'R' , r , c-1);
        }
    }

//    agar bole ki arraylist bana ke dena hai ,,, niche me code hai

    static ArrayList<String> pathlist(String p , int r , int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1)
        {
            ans.addAll(pathlist(p+'D' ,r-1 , c));
        }

        if(c>1)
        {
            ans.addAll(pathlist(p+'R' , r , c-1));
        }
        return ans;
    }

//    ab agar bole ki tum diagonally bhi chal sakte ho to ,, nicche code hai dekh lo

    static ArrayList<String> diagpath(String p , int r , int c)
    {
        if(r==1 && c ==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1)
        {
            ans.addAll(diagpath(p+'D' , r-1, c-1));
        }

        if(r>1)
        {
            ans.addAll(diagpath(p+'V' , r-1 , c));
        }

        if(c>1)
        {
            ans.addAll(diagpath(p+'H' , r , c-1));
        }
        return ans;
    }

//    ab agar bole ki bich me kahi ek obstecals bhi hai ...us par se nhi ja sakte tum ..to kya karoge ??,,,code
//    code niche hai dekh lo

    static void Obstecals(String p ,boolean[][] maze, int r , int c)
    {
        if(r==0 && c==0)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        if(r>0)
        {
            Obstecals(p+'D' ,maze, r-1 , c);
        }

        if(c>0)
        {
            Obstecals(p+'R' , maze , r , c-1);
        }
    }
}
