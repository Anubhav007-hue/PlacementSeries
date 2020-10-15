public class BST2DoublyLinkedList{


    TreeNode prev=null;
    class TreeNode 
    {
        int val;
        TreeNode left=null;
        TreeNode right=null;

        TreeNode (int data)
        {
            this.val=data;
        }
    }

    public void printList(TreeNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+" ");
            head=head.right;
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

        else if(root.val<data)
        {
            root.right=insert(root.right,data);
        }

        else if(root.val>data)
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
        System.out.print(root.val+" ");
        printTree(root.right);
    }
    public static void main(String[] args)
    {
        BST2DoublyLinkedList bdd=new BST2DoublyLinkedList();
            int values[]={3,4,7,2,9,6,8};
            TreeNode root=null;
            for(int i:values)
            {
                root=bdd.insert(root,i);
            }
        System.out.println("Linked List representation of the bst is :");
        TreeNode head= bdd.convert(root);
        bdd.printList(head);


        
    }

    // FUNCTION FOR CONVERTING THE BST TO THE DOUBLY LINKED LIST ................................................

    public TreeNode convert(TreeNode root)
    {
        prev=null;
    // SETTING THE LEFT POINTER AS THE PREV POINTER OF THE LIST........................................
        setLeft(root);
    // SETTING THE RIGHT POINTER AS THE NEXT POINTER OF THE LIST.......................................
        return setRight(root);
    }

    public void setLeft(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        setLeft(root.left);
        root.left=prev;
        prev=root;
        setLeft(root.right);
    }

    public TreeNode setRight(TreeNode root)
    {
        TreeNode current=root;
        while(current.right!=null)
        {
            current=current.right;
        }

        while(current!=null && current.left!=null)
        {
            TreeNode left=current.left;
            left.right=current;
            current=current.left;
        }
        return current;
    }
}