import java.util.*;
public class SingleNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the nmber of testcases");
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
        int num=0;

        for(int i:nums)
        {
            num^=i;
        }
        return num;
    }
}
