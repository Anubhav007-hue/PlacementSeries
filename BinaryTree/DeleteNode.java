import java.util.*;
import java.io.*;
public class DeleteNode {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases");
        int t=Integer.parseInt(br.readLine());
       
        while(t-->0)
        {
            CreateTree ct=new CreateTree();
            ct.scan=new Scanner(System.in);
            ct.root= ct.createTree();
            ct.inorder(ct.root);
        }
    }
    
}
