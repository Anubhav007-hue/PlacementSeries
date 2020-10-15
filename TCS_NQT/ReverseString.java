import java.io.BufferedReader;

import java.io.*;

import java.util.*;


public class ReverseString
{
    public static void main(String[] args) 
    {
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcase");
        int t=scan.nextInt();
       
        while(t>=0){
        // System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println(reverse(str));
        t--;
        }
        
    }

    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder();
        int first=str.length()-1;
        int last=str.length()-1;

        while(first>=0)
        {
            while( first>=0 && str.charAt(first)!=' ')
            {
                first--;
            }
            sb.append(str.substring(first+1,last+1));
            while(first>=0 && str.charAt(first)==' ')
            {
                first--;
            }
            last=first;
        }
        // first++;
        // sb.append(str.substring(first,last));

        return sb.toString();
    }


}