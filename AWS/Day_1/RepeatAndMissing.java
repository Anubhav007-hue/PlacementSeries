package Day_1;
import java.util.*;
import java.io.*;
public class RepeatAndMissing {

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=Integer.parseInt(br.readLine());
            int [] nums=new int[n+1];
            System.out.println("Enter the elements of the array");
            String str=br.readLine();
            int idx=0;
            for(String s:str.split(" "))
            {
                nums[idx++]=Integer.parseInt(s);
            }
            solve(nums,n);
        }
    }
    public static void solve(int [] nums,int n)
    {
        if(n==0 || nums==null)
        {
            return ;
        }

       int idx=0;
       while(idx!=n)
       {
           if(nums[idx]==nums[nums[idx]-1])
           {
               idx++;
           }
           else 
           {
               makeValid(nums,idx);
           }
       }

       for(int i=0;i<n;i++)
       {
           if(nums[i]-1!=i)
           {
               System.out.println("The missing number is "+(i+1)+" and the duplicate number is "+nums[i]);
           }
       }
    }

    public static void makeValid(int [] nums,int i)
    {
        int temp=nums[i];
        nums[i]=nums[temp-1];
        nums[temp-1]=temp;
    }
    
}


// PROBLEM STATEMENT :
// Repeat and Missing Number 

