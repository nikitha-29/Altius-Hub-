import java.util.*;
class ReverseLinkedList
{
    class ListNode
    {
        int val;
        Node next;
        ListNode(val)
        {
            this.val=val;
            this.next=null;

        }


    }
    public static void main(String[] args)
    {
        ListNode head=new ListNode(4);
        head.next=new ListNode(5);
        head.next.next=new ListNode(7);
        System.out.println("initial list:");
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
}
class ReverseLinkedList
{
    ListNode prev=null;
    ListNode curr=head;
    ListNode next=null;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;

}