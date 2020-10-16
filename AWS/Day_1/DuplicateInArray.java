package Day_1;
import java.util.*;
import java.io.*;
public class DuplicateInArray {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=Integer.parseInt(br.readLine());
            int [] nums=new int[n];
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

        for(int i=0;i<n;i++)
        {
            nums[nums[i]%n]+=n;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=n*2)
            {
                System.out.print(i+" ");
            }
        }
    }
}

/*
    Using the formula x+n+n+n
    so if the number is repeated more then once times then that number of times ih 
    has been epreated if we divide the number by n.
    
    Suppose we have n=9
    then it will be x+9+9+9 then it will be x+27 and if we divide it it will give us 3 in interger value and we


    And to find the original array just divide the nums[i] with modulas n.
    TO GET THE ORIGINAL ARRAY ............
    for(int i=0;i<n;i++)
    {
        nums[i]=nums[i]%n;
    }


    PROBLEM STATEMENT:
    Find the duplicate in an array of N+1 integers. 
*/
