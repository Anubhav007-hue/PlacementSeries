package Day_2;
import java.util.*;
public class NextPermutation {
    static List<String> permutations=new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            System.out.println("Enter the  elements of the array");
            int [] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scan.nextInt();
            }
            StringBuilder target=new StringBuilder();
            for(int i:nums)
            {
                target.append(i);
            }
            String sorted=new String();
            sorted=sort(0,n-1,target.toString(),n);
            solve(sorted,n,0,n-1);
            String result=new String();
            int size=permutations.size();
         
            for(int i=0;i<permutations.size();i++)
            {
                if(target.toString().equals(permutations.get(i)))
                {
                    result=permutations.get((i+1)%size);
                    break;
                }
            }
            System.out.println("The rsult string is"+result);
        }
        scan.close();
    }

    public static void solve(String original,int n,int left,int right)
    {
        if(left==right)
        {
            permutations.add(original);
            return ;
        }

        for(int i=left;i<=right;i++)
        {
            original=swap(original,left,i);
            original=sort(0+left+1,n-1,original,n);
            solve(original,n,left+1,right);
            original=swap(original,left,i);
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

    public static String sort(int start,int end,String str,int n)
    {
        char[] nums=str.toCharArray();
        int sentinal=start;
        for(int i=start+1;i<=end;i++)
        {
            char temp=nums[i];
            int j=i-1;

            while(j>=sentinal && nums[j]>temp)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
        }

        return new String(nums);
    }
}
