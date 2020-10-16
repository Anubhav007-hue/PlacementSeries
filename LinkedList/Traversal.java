import java.util.*;
public class Traversal
 {
    
    class ListNode 
    {
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data=data;
        }
    }

    ListNode head=null;

    public  void insert(int data)
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
    }

    public  void printList(ListNode head)
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
        Traversal tt=new Traversal();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testcases");
        int t=scan.nextInt();
        while(t-->0)
        {
            System.out.println("Enter the head of the list");
            int data=scan.nextInt();
            while(data!=-1)
            {
                tt.insert(data);
                data=scan.nextInt();
            }
            tt.printList(tt.head);
            tt.head=null;
        }
        
    }
}
