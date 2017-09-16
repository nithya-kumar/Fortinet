package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import linkedlist.ReverseLL.Node;

public class ReverseLLTest {

	@Test
	public void test1() {
		ReverseLL list = new ReverseLL();
        ReverseLL.setHead(new Node(10));
        ReverseLL.getHead().next = new Node(20);
        ReverseLL.getHead().next.next = new Node(30);
        ReverseLL.getHead().next.next.next = new Node(40);
        ReverseLL.setHead(list.reverse(ReverseLL.getHead()));
        String revList = "";
        while (ReverseLL.getHead() != null) {
            revList = revList + ReverseLL.getHead().value + ",";
            ReverseLL.setHead(ReverseLL.getHead().next);
        }
        String expected = "40,30,20,10,";
        assertEquals(expected, revList.toString());
	}
	
	@Test
	public void test2() {
		ReverseLL list = new ReverseLL();
        ReverseLL.setHead(new Node(5));
        ReverseLL.getHead().next = new Node(2);
        ReverseLL.getHead().next.next = new Node(9);
        ReverseLL.setHead(list.reverse(ReverseLL.getHead()));
        String revList = "";
        while (ReverseLL.getHead() != null) {
            revList = revList + ReverseLL.getHead().value + ",";
            ReverseLL.setHead(ReverseLL.getHead().next);
        }
        String expected = "9,2,5,";
        assertEquals(expected, revList.toString());
	}
	
	@Test
	public void test3() {
		ReverseLL list = new ReverseLL();
        ReverseLL.setHead(new Node(32));
        ReverseLL.getHead().next = new Node(21);
        ReverseLL.getHead().next.next = new Node(87);
        ReverseLL.getHead().next.next.next = new Node(46);
        ReverseLL.getHead().next.next.next.next = new Node(58);
        ReverseLL.setHead(list.reverse(ReverseLL.getHead()));
        String revList = "";
        while (ReverseLL.getHead() != null) {
            revList = revList + ReverseLL.getHead().value + ",";
            ReverseLL.setHead(ReverseLL.getHead().next);
        }
        String expected = "58,46,87,21,32,";
        assertEquals(expected, revList.toString());
	}

}
