
public class ReverseLinkList2 {
	public ListNode reverseBetween(ListNode start, int left, int right) {
        ListNode cur= start;
        ListNode prev = null;
        
        while(left - 1 > 0){
            prev=cur;
            cur = cur.next;
            left--;
            right--;
        }
        ListNode head= prev;
        ListNode tail= cur;
        
        while(right > 0){
            ListNode next= cur.next;
            cur.next= prev;
            prev= cur;
            cur= next;
            right--;
        }
        if(head != null)
            head.next= prev;
        else
            start = prev;
        
        tail.next= cur;
        
        return start;
        
    }

}
