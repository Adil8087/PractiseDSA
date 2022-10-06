import java.util.LinkedList;
import java.util.Queue;

class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
};

public class FlattenLinkedList {
	public Node flatten(Node head) {

		Node cur = head;
		Node pre = null;
		Queue<Node> queue = new LinkedList<>();

		while (cur != null) {
			if (cur.next == null) {
				cur.next = queue.poll();
			}
			if (cur.child != null) {
				queue.offer(cur.child);
			}
			cur.prev = pre;
			pre = cur;
			cur = cur.next;

		}

		return head;
	}

}
