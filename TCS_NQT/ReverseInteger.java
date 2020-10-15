import java.io.*;
public class ReverseInteger {

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            System.out.println("Enter the number to reverse");
            int num=Integer.parseInt(br.readLine());
            System.out.println(reverse(num));
        }
    }
    public static int reverse(int num)
    {
        if(num>=0 && num<=9 || num>=-9 && num<=-1)
        {
            return num;
        }
        int res=0;
        int digit=0;
        int pre=0;
        while(num!=0)
        {
            digit=num%10;
            res=res*10+digit;
            if ((res-digit)/10 != pre) 
            { 
                
                return 0; 
            } 
            pre=res;
            num=num/10;
        }
        res/=10;
        return res;
    }
}
