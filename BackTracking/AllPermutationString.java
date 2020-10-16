import java.util.*;
import java.io.*;
public class AllPermutationString {
   static List<String> permutations=new ArrayList<>();
    public static void main(String[] args)throws IOException
    {
        Scanner scan=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the string");
            String str=br.readLine();
            int n=str.length();
            solve(str,0,n-1);
            System.out.println("All the permutations are");
            for(String s:permutations)
            {
                System.out.println(s);
            }
        }
        scan.close();
    }
    public static void solve(String str,int left,int right)
    {
        if(left==right)
        {
            permutations.add(str);
            return ;
        }

        for(int i=left;i<=right;i++)
        {
            str=swap(str,left,i);
            solve(str,left+1,right);
            str=swap(str,left,i);
        }
    }
    public static String swap(String str,int left,int i)
    {
        char[] c=str.toCharArray();
        char temp=c[left];
        c[left]=c[i];
        c[i]=temp;

        return new String(c);
    }
}
