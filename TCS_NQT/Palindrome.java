import java.io.IOException;
import java.io.*;

public class Palindrome{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            System.out.println("Enter the string");
            String str=br.readLine();
            System.out.println(palindrome(str));
        }
    }

    public static boolean palindrome(String str)
    {
        int n=str.length();
        if(n==0)
        {
            return true;
        }
        
        int first=0;
        int last=n-1; 
        while(first<=last)
        {
            if(str.charAt(first++)!=str.charAt(last--)) return false;
        }

        return true;
    }
    
}
