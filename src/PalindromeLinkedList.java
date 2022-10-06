
public class PalindromeLinkedList {
	
public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return true;
        if( head.next!=null && head.next.next == null){
            return head.val == head.next.val;
        }
        
        ListNode mid= middle(head);
        ListNode rev= reverse(mid);
        
        while(rev != null){
            if(head.val != rev.val){
                return false;
            }
            head= head.next;
            rev= rev.next;
        }
        return true;      
    }
    
    private static ListNode middle(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    private static ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev= null;
        while(cur!=null){
            ListNode next= cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
    }

}
