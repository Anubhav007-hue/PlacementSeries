import java.util.*;
public class HeapSort {

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
        scan.close();
    }
    public static void solve(int [] nums,int n)
    {
        if(n==0 || nums==null)
        {
            return ;
        }
        sort(nums,n);

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }

    public static void sort(int [] nums,int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(nums,n,i);
        }

        for(int i=n-1;i>0;i--)
        {
            int temp=nums[i];
            nums[i]=nums[0];
            nums[0]=temp;
            heapify(nums,i,0);
        }
    }

    public static void heapify(int [] nums,int n, int root)
    {
        int max=root;
        int left=2*root+1;
        int right=2*root+2;

        if(left<n && nums[left]>nums[max])
        {
            max=left;
        }

        if(right<n && nums[right]>nums[max])
        {
            max=right;
        }

        if(max!=root)
        {
            int temp=nums[max];
            nums[max]=nums[root];
            nums[root]=temp;

            heapify(nums,n,max);
        }
    }
    
}
