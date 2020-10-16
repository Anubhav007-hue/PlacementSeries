import java.util.*;
public class BuyAnsSellStock {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the number of stocks");
            int n=scan.nextInt();
            System.out.println("Enter the prices of the stocks");
            int [] prices=new int[n];
            for(int i=0;i<n;i++)
            {
                prices[i]=scan.nextInt();
            }
            System.out.println(solve(prices,n));
        }
    }

    public static int solve(int [] prices,int n)
    {
        int max=0;
        if(prices.length==0 || prices==null)
        {
            return max;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prices[i]>min)
            {
                max=Math.max(max,prices[i]-min);
            }
            else 
            {
                min=Math.min(prices[i],min);
            }
        }

        return max;
    }
}
