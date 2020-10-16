package Day_1;
import java.util.*;
import java.io.*;
public class SortArray_0_1_2 {

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
        if(n==0 || nums==null){
            return;
        }
        // COUNTING THE NUMBER OF THE ZEROES ,ONES AND THE TWOS...................
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else if(nums[i]==1)
            {
                one++;
            }
            else 
            {
                two++;
            }
        }
        // FILLING THE ARRAY WITH THE NUMBER OF COUNT OF THE NUMBERS.............
        int idx=0;
        while(zero>0)
        {
            nums[idx++]=0;
            zero--;
        }
        while(one>0)
        {
            nums[idx++]=1;
            one--;
        }

        while(two>0)
        {
            nums[idx++]=2;
            two--;
        }

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
    
}


/*
    PROBLEM STATEMENT:
    Sort an array of 0’s 1’s 2’s without using extra space or sorting algo .
*/
