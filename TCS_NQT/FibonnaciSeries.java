import java.util.*;
import java.io.*;
public class FibonnaciSeries {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int num=Integer.parseInt(br.readLine());
            fibonaciSeries(num);
        }
    }

    public static void fibonaciSeries(int num)
    {
        int[] dp=new int [num];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<num;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        for(int i:dp)
        {
            System.out.print(i+" ");
        }
    }
}
