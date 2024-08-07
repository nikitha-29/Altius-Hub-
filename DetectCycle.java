import java.util.*;
class DetectCycle
{
   class ListNode
   {
    int val;
    ListNod next;
     ListNode(int val)
     {
        this.val=val;
        this.next=null;

     }
   }
    public static void main(String[] args)
    {
        ListNode head=new ListNode(5);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        boolean ans=cycle(head);
        System.out.println("Cycle detected:"+ans);
        
    }
}
}
Class LinkedListCycle{


    public static boolean cycle(ListNode head)
    {
        if(head==null)
        {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    
}