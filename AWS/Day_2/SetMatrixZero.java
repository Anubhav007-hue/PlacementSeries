package Day_2;
import java.util.*;
public class SetMatrixZero {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the number of rows");
            int row=scan.nextInt();
            System.out.println("Enter the number of column");
            int col=scan.nextInt();
            System.out.println("Enter the data");
            int [][] grid=new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    grid[i][j]=scan.nextInt();
                }
            }
            solve(grid,row,col);
        }

    }

    // OPTIMIZED SOLUTION..................................

    public static void solve(int [][] grid,int row,int col)
    {
        if(row==0 && col==0)
        {
            return ;
        }
        boolean r=false;
        boolean c=false;

        // CHECKING IF THE FIRST ROW CONTAIN A ZERO..
        for(int i=0;i<col && c!=true;i++)
        {
            if(grid[0][i]==0)
            {
                c=true;
                
            }
        }

        // CHECKING IF THE FIRST COLUMN CONTAIN A ZERO..
        for(int i=0;i<row && r!=true;i++)
        {
            if(grid[i][0]==0)
            {
                r=true;
                
            }
        }
        

        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(grid[i][j]==0)
                {
                    grid[i][0]=0;
                    grid[0][j]=0;
                }
            }
        }

        for(int i=1;i<col;i++)
        {
            if(grid[0][i]==0)
            {
                for(int j=1;j<row;j++)
                {
                    grid[j][i]=0;
                }
            }
        }

        for(int i=1;i<row;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=1;j<col;j++)
                {
                    grid[i][j]=0;
                }
            }
        }

        if(c==true)
        {
            for(int i=0;i<col;i++)
            {
                grid[0][i]=0;
            }
        }

        if(r==true)
        {
            for(int i=0;i<row;i++)
            {
                grid[i][0]=0;
            }
        }

        // PRINTING THE ENTIRE MATRIX.......

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
     }
    
    /*

    ...................NOT AN OPTIMIZED SOLUTION WHEN COMES TO SPACE..................

    public static void solve(int[][] grid,int row,int col)
    {
        Set<String> set=new HashSet<>();
        Iterator<String> it=set.iterator();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==0)
                {
                    set.add(""+i+j);
                
                }
            }
        }

        for(String s:set)
        {
                int r=s.charAt(0)-'0';
                int c=s.charAt(1)-'0';
                for(int i=0;i<col;i++)
                {
                    grid[r][i]=0;
                }
                for(int i=0;i<row;i++)
                {
                    grid[i][c]=0;
                }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    */
}
