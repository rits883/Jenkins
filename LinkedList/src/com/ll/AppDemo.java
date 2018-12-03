package com.ll;

public class AppDemo {

	public static void main(String[] args) {
		LinkedList ll   = new LinkedList();
		ll.head = new Node(1);
		
		Node second = new Node(2);
		ll.head.next = second;
		
		Node third  = new Node(3);
		second.next = third;
		Node fourth  = new Node(4);
		third.next =fourth;
		Node fifth  = new Node(5);
		fourth.next =fifth;
		Node six  = new Node(6);
		fifth.next =six;
		ll.push(0);
		ll.inserNodeAfter(six, 7);
		ll.appened(8);
		
		
		Node n = ll.head;
		while (n!=null) {
			System.out.println(n.data);
			n= n.next;
		}
		
		
	}

}
