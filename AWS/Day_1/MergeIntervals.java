package Day_1;
import java.util.*;
public class MergeIntervals {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the intervals");
            int n=scan.nextInt();
            System.out.println("Enter the intervals");
            int [][] intervals=new int[n][2];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the interval "+i);
                intervals[i][0]=scan.nextInt();
                intervals[i][1]=scan.nextInt();
            }
            solve(intervals,n);
        }
    }
    public static void solve(int [][] intervals,int n)
    {
        if(n==0)
        {
            return ;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        List<int []> temp=new ArrayList<>();
        for(int[] interval:intervals)
        {
            pq.add(interval);
        }
        int [] first=new int[2];
        int [] second=new int[2];
        int idx=0;
        while(pq.size()>1)
        {
            first=pq.remove();
            second=pq.remove();
            if(first[1]>=second[0])
            {
                int [] newI=new int[2];
                newI[0]=Math.min(first[0],second[0]);
                newI[1]=Math.max(first[1],second[1]);
                pq.add(newI);
            }
            else 
            {
                temp.add(first);
                pq.add(second);
                idx++;
            }
        }

        while(pq.size()>0)
        {
            temp.add(pq.remove());
        }

        int i=0;
        idx=0;
        int [][] res=new int[temp.size()][2];
        while(idx!=temp.size())
        {
            int [] r=new int[2];
            r=temp.get(idx);
            res[i]=r;
            i++;
            idx++;
        }

        for(i=0;i<res.length;i++)
        {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
