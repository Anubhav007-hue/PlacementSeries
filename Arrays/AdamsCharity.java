import java.util.*;
public class AdamsCharity {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbber of charity days");
        int n=scan.nextInt();
        System.out.println(solve(n));
    }

    public static int solve(int n)
    {
        if(n==0)
        {
            return 0;
        }

        int cost=0;

        for(int i=1;i<=n;i++)
        {
            cost=cost+(int)Math.pow(i,2);
        }

        return cost;
    }

}
