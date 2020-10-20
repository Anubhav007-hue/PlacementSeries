public class CreateBST {

    class TreeNode
    {
        int data;
        TreeNode left=null;
        TreeNode right=null;

        TreeNode (int data)
        {
            this.data=data;
        }

    }

    public TreeNode createNode(int data)
    {
        TreeNode root=new TreeNode(data);
        return root;
    }

    public TreeNode insert(TreeNode root,int data)
    {
        if(root==null)
        {
            return createNode(data);
        }
        else if(root.data<data)
        {
            root.right=insert(root.right,data);
        }
        else 
        {
            root.left=insert(root.left,data);
        }

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
    
    
}
