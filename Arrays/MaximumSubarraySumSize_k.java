import java.util.*;
public class MaximumSubarraySumSize_k {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            System.out.println("Enter the window size");
            int k=scan.nextInt();
            System.out.println("Enter the elements of the array");
            int [] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scan.nextInt();
            }
            System.out.println(solve(nums,n,k)==Integer.MIN_VALUE ? "Invalid" : solve(nums,n,k));
        }
        scan.close();
    }
    
    public static int solve(int [] nums,int n,int k)
    {
        int maxSum=Integer.MIN_VALUE;
        if(n==0 || nums==null || k>n)
        {
            return maxSum;
        }
        int res=0;
        int left=0;
        for(int i=0;i<k;i++)
        {
            res+=nums[i];
        }
        int current=res;
        maxSum=Math.max(maxSum,current);
        for(int i=k;i<n;i++)
        {
            current=current+nums[i]-nums[left];
            maxSum=Math.max(maxSum,current);
            left++;
        }
        return maxSum;
    }
}
