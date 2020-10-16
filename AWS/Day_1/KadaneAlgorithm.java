package Day_1;
import java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            System.out.println("Enter the elements of the array");
            int [] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scan.nextInt();
            }
            System.out.println(solve(nums,n));
        }

    }
    public static int solve(int [] nums,int n)
    {
        if(n==0 || nums==null)
        {
            return 0;
        }
        if(n==1)
        {
            return nums[0];
        }
        int finalMax=nums[0];
        int temp=nums[0];
        for(int i=1;i<n;i++)
        {
            temp=Math.max(temp+nums[i],nums[i]);
            finalMax=Math.max(finalMax,temp);
        }

        return finalMax;
    }


}
