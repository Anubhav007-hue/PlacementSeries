import java.io.*;
import java.util.*;
public class PrimeNumber {
    public static void main(String [] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcase");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            System.out.println("Enter the number");
            int num=Integer.parseInt(br.readLine());
            System.out.println(prime(num));
        }
    }
    public static boolean prime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }

        return true;
    }
    
}

