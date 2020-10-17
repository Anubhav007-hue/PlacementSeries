import java.util.*;
public class LowestCommonAncestor {

    static Scanner scan=null;
    static TreeNode root=null;
    class TreeNode 
    {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    public TreeNode insert()
    {
        System.out.println("Enter the data");
        int data=scan.nextInt();
        if(data==-1)
        {
            return null;
        }
        TreeNode root=new TreeNode(data);
        System.out.println("Enter the left data for: "+data);
        root.left=insert();
        System.out.println("Enter the right data for: "+data);
        root.right=insert();

        return root;

    }

    public void printTree(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }

    public static void main(String[] args)
    {
        LowestCommonAncestor lca=new LowestCommonAncestor();
        scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            lca.root=lca.insert();
            lca.printTree(lca.root);
            
        }
    }
    
}
