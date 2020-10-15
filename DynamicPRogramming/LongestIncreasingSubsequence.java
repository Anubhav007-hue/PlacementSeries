
import java.util.*;
public class LongestIncreasingSubsequence {
    
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcase");
        int t=scan.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            int [] nums=new int[n];
            System.out.println("Enter the element of the array");
            for(int i=0;i<nums.length;i++)
            
            {
                nums[i]=scan.nextInt();
            }
            System.out.println(solve(nums,n));
        }
    }

    public static int solve(int[] nums,int n) {
        
        if(n==0)
        {
            return 0;
        }
        int [] dp=new int [n+1];
        dp[0]=1;
       
        int final_max=1;
        
        for(int i=1;i<n;i++)
        {
            int tempMax=0;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    tempMax=Math.max(dp[j],tempMax);
                }
            }
            
            dp[i]=1+tempMax;
            final_max=Math.max(final_max,dp[i]);
        }
        
        return final_max;
    }
}
