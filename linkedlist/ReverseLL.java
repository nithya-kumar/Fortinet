package linkedlist;

public class ReverseLL {

	private static Node head;
	 
    public static class Node {
        Node next;
        int value;
        Node(int v) {
            next = null;
            value = v;
        }
    }
    
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

	public static Node getHead() {
		return head;
	}

	public static void setHead(Node head) {
		ReverseLL.head = head;
	}
}