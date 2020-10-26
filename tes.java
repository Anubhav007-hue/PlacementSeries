import java.util.*;
import java.util.ArrayList;

public class tes {

    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        boolean loop = true;
        String line;
        while ((line = in.nextLine()).length() > 0) {
            list.add(Integer.parseInt(line));
        }
        int sum=0;
        for(int i:list)
        {
            sum+=i;
        }
        System.out.println("The sum is "+sum);

    }
}
