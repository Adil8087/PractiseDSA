
public class FlattenDoublyLinkedList {
public Node flatten(Node head) {
        
        Node curr=head;
        
        while(curr!= null){
            if(curr.child!=null){
                Node levelChange= curr.next;
                curr.next=curr.child;
                curr.child.prev=curr;
                curr.child=null;
                
                addNext(curr.next, levelChange);    
            }
            curr=curr.next;
        }
        return head;
       
    }
     private void addNext(Node first,Node last){
        while(first.next!=null){
            first=first.next;
        }
        first.next=last;
        if(last!=null)last.prev=first;
    }

}
