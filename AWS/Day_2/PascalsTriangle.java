package Day_2;
import java.util.*;
public class PascalsTriangle {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the number of rows");
            int n=scan.nextInt();
            List<List<Integer>> result=new ArrayList<>();
            solve(n,result);
            for(int i=0;i<result.size();i++)
            {
                for(int j=0;i<result.get(i).size();j++)
                {
                    System.out.print(result.get(i).get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    public static void solve(int n,List<List<Integer>> result)
    {
        if(n==0)
        {
            return ;
        }

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        result.add(list1);
        if(n==1)
        {
            return ;
        }

        List<Integer> list2=new ArrayList<>();
          list2.add(1);
          list2.add(1);
          result.add(list2);
        if(n==2)
        {
            return ;
        }

        for(int i=3;i<=n;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<result.get(result.size()-1).size()-1;j++)
            {
                int f=result.get(result.size()-1).get(j);
                int s=result.get(result.size()-1).get(j+1);
                temp.add(f+s);
            }
            temp.add(1);
            result.add(temp);
        }
    }
}
