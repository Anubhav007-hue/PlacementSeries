package Day_1;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the first array");
            int n1=scan.nextInt();
            System.out.println("Enter the size of the second array");
            int n2=scan.nextInt();
            System.out.println("Enter  the elements of the first array");
            int [] nums1=new int[n1];
            for(int i=0;i<n1;i++)
            {
                nums1[i]=scan.nextInt();
            }
            System.out.println("Enter the elements of the second array");
            int [] nums2=new int[n2];
            for(int i=0;i<n2;i++)
            {
                nums2[i]=scan.nextInt();
            }
            solve(n1,n2,nums1,nums2);
        }
    }
    public static void solve(int n1,int n2,int[] nums1,int[] nums2)
    {
        if(n1==0 && n2==0 && nums1==null && nums2==null)
        {
            return ;
        }
        if(n1==0 || n2==0)
        {
            return ;
        }

        for(int i=0;i<n1;i++)
        {
            if(nums1[i]>=nums2[0])
            {
                swap(i,0,nums1,nums2);
                if(nums2[0]>nums2[1]){
                fixSecond(nums2,n2);
                }
            }
        }
        System.out.println("Elements in the first array is");
        for(int i:nums1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Elements in the second array is");
        for(int i:nums2)
        {
            System.out.print(i+" ");
        }
    }
    public static void swap(int i,int j,int [] nums1,int [] nums2)
    {
        int temp=nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=temp;

    }
    public static void fixSecond(int[] nums2,int n2)
    {
        int sentinal=0;
        for(int i=1;i<n2;i++)
        {
            int j=i-1;
            int temp=nums2[i];
            while(j>=sentinal && nums2[j]>temp)
            {
                nums2[j+1]=nums2[j];
                j--;
            }
            nums2[j+1]=temp;
        }
    }
}
