import java.util.*;
import java.io.*;
public class CreateTree
{

   static  Scanner scan=null;
   static TreeNode root=null;

   class TreeNode
   {
       int data;
       TreeNode left=null;
       TreeNode right=null;
       TreeNode(int data)
       {
           this.data=data;
       }
   }
    public static void main(String[] args)throws IOException
    {   scan=new Scanner(System.in);
        CreateTree ct=new CreateTree();
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
             root=ct.createTree();
            System.out.println("The tree is ");
            ct.inorder(root);
        }
    }

    public  TreeNode createTree()
    {
        TreeNode root=null;
        System.out.println("Enter the data");
        int data=scan.nextInt();
        if(data==-1)
        {
            return null;
        }
        root=new TreeNode(data);
        System.out.println("Enter left of "+data);
        root.left=createTree();
        System.out.println("Enter the data for right "+data);
        root.right=createTree();

        return root;

    }

    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}