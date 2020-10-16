import java.util.*;
public class AllPermutation {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the size of the array");
            int n=scan.nextInt();
            System.out.println("Enter the array element");
            int [] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=scan.nextInt();
            }
            List<List<Integer>> permutations=new ArrayList<>();
            solve(nums,n,permutations,0,n-1);
            for(List list:permutations)
            {
                System.out.print(list+" ");
                System.out.println();
            }
        }
    }
    
    public static void solve(int [] nums,int n,List<List<Integer>> permutations,int left,int right)
    {
        if(left==right)
        {
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)temp.add(nums[i]);
            permutations.add(temp);
            return ;
        }

        for(int i=left;i<=right;i++)
        {
            swap(nums,left,i);
            sort(0+left+1,n-1,nums,n);
            solve(nums, n, permutations, left+1, right);
            swap(nums,left,i);
        }
        
    }

    public static void swap(int[] nums,int left,int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    } 

    public static void sort(int start,int end,int [] nums,int n)
    {
        int sentinal=start;
        for(int i=start+1;i<=end;i++)
        {
            int temp=nums[i];
            int j=i-1;

            while(j>=sentinal && nums[j]>temp)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
        }
    }
}
