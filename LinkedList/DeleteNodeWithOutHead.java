import java.util.*;
public class DeleteNodeWithOutHead {

    class ListNode
    {
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data=data;
        }
    }

    
    public ListNode insert(int data,ListNode head)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
        }

        else 
        {
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }

            current.next=newNode;
        }
        return head;
    }

    public void printList(ListNode head)
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args)
    {
        DeleteNodeWithOutHead dh=new DeleteNodeWithOutHead();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            ListNode head=null;
            System.out.println("Enter the head of the list");
            int data=scan.nextInt();
            while(data!=-1)
            {
                head=dh.insert(data,head);
                data=scan.nextInt();
            }
            System.out.println("Enter the target to be deleted");
            int target=scan.nextInt();
            ListNode delete=dh.getNode(head,target);
            if(delete!=null)
            {
                dh.solve(delete);
                dh.printList(head);
            }
        }
    }
    
    public ListNode getNode(ListNode head,int target)
    {
        if(head==null)
        {
            return null;
        }

        ListNode current=head;

        while(current!=null)
        {
            if(current.data==target)
            {
                return current;
            }
            current=current.next;
        }

        return null;
    }

    public void solve(ListNode delete)
    {
        delete.data=delete.next.data;
        delete.next=delete.next.next;
    }
}
