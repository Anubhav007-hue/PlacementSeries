package TCS_NQT;

import java.util.Scanner;
import java.math.BigInteger; 

public class PowerFunction {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int k=scan.nextInt();
        System.out.println(solve(n,k));
    }
    public static BigInteger solve(int n ,int k)
    {
        BigInteger res=BigInteger.ONE;
        for(int i=1;i<=k;i++)
        {
            res=res.multiply(BigInteger.valueOf(n));
        }

        return res;
    }
}

