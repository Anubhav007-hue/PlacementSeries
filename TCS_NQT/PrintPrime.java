import java.io.InputStreamReader;

import java.util.*;
import java.io.*;
public class PrintPrime {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int num=Integer.parseInt(br.readLine());
            printPrime(num);
            System.out.println();
        }
    }
    public static void printPrime(int num)
    {
        boolean [] prime=new boolean[num*num];
        for(int i=0;i<prime.length;i++)
        {
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;
        
        for(int i=2;i*i<num*num;i++)
        {
            if(prime[i]==true)
            {
                  for(int j=i;j*i<num*num;j++)
              {
                  prime[i*j]=false;    
              }
            }
        }
        int cnt=0;
        int idx=2;
        while(cnt!=num+1)
        {
            if(prime[idx]==true)
            {
                System.out.print(idx+" ");
                cnt++;   
            }
            idx++;
        }
    }
}
