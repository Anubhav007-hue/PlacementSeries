import java.util.*;
public class VerifyPreorder {

    class TreeNode 
    {
        int data;
        TreeNode left=null;
        TreeNode right=null;

    }

    public static void main(String[] args)
    {
        CreateBST cb=new CreateBST();
        int [] preorder={40,30,35,20,80,100};
        System.out.println(solve(preorder));
    }

    public static boolean solve(int [] preorder)
    {
        Stack<Integer> stack=new Stack<>();
        int root=Integer.MIN_VALUE;

        for(int i=0;i<preorder.length;i++)
        {
            if(root>preorder[i])
            {
                return false;
            }

            while(stack.size()>0 && preorder[i]>stack.peek())
            {
                root=stack.pop();
            }
            stack.push(preorder[i]);
        }

        return true;
    }
    
}
