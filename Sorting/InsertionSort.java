import java.util.*;
public class InsertionSort {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            System.out.println("Enter the element of the array");
            int [] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scan.nextInt();
            }
            solve(nums,n);
        }
    }

    public static void solve(int[] nums,int n)
    {
        if(n==0 || nums==null)
        {
            return ;
        }
        int sentinal=0;
        for(int i=1;i<n;i++)
        {
            int temp=nums[i];
            int j=i-1;

            while(j>=sentinal && nums[j]>temp)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
        }

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
    
}
