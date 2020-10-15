import java.util.*;
import java.io.*;
public class LeapYear {
    public static void main(String [] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            System.out.println("Enter the number");
            int num=Integer.parseInt(br.readLine());
            System.out.println(solve(num));
        }
    }
    public static boolean solve(int num)
    {
        if(num%4==0)
        {
            if(num%100==0)
            {
                if(num%400==0)
                {
                    return true;
                }
                else 
                {
                    return false;
                }
            }
            else 
            {
                return true;
            }
        }
        
        return false;
    }
}
