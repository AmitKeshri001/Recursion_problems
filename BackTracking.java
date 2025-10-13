package com.amit;

public class BackTrack
{
    public static void main(String[] args) {
        boolean[][] maze = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
//        path("" , maze ,0,0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("",maze,0,0,path,1);
    }

    static void path(String p ,boolean[][] maze , int r , int c)
    {
        if(r==maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;

        if(r<maze.length-1)
        {
            path(p+'D',maze , r+1,c);
        }

        if(c<maze[0].length-1)
        {
            path(p+'R' , maze , r , c+1);
        }

        if(r>0)
        {
            path(p+'U',maze,r-1,c);
        }

        if(c>0)
        {
            path(p+'L',maze,r,c-1);
        }

        maze[r][c] = true;

    }

//    ab agar manlo tumko ek matrix along with path bhi print karna hai to kaise karega??,, code niche hai..

    static void allPathPrint(String p , boolean[][] maze ,int r , int c , int[][] path , int step )
    {
        if(r==maze.length-1 && c== maze[0].length-1)
        {
            path[r][c] = step;
            for(int i=0;i<path.length;i++)
            {
                for(int j=0;j<path[i].length;j++)
                {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1)
        {
            allPathPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1)
        {
            allPathPrint(p+'R',maze,r,c+1,path,step+1);
        }

        if(r>0)
        {
            allPathPrint(p+'U',maze,r-1,c,path,step+1);
        }

        if(c>0)
        {
            allPathPrint(p+'L',maze,r,c-1,path,step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
