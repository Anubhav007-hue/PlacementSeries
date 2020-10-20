import java.util.*;

public class MinimumValueNode {
    
    public static void main(String[] args)
    {
        
        CreateBST cb=new CreateBST();
        CreateBST.TreeNode root = null;
        int [] nums={4,8,20,22,10,12,14};
        for(int i:nums)
        {
            root=cb.insert(root, i);      
        }
        System.out.println(solve(root));
    }

    public static int solve(CreateBST.TreeNode root)
    {
        CreateBST.TreeNode current=root;
        while(current.left!=null)
        {
            current=current.left;
        }

        return current.data;
    }
}
