package com.ll;

public class LinkedList {
	 Node head ;	

/** push method insert new head*/
public  void push(int data) {
	Node newNode = new Node(data);
	newNode.next = head;
	 head = newNode;
}

/**Insert in between*/
public  void inserNodeAfter(Node prevNode , int data) {
	
	if(prevNode==null) {
		System.out.println("Prvious node cannt be null");
		return;
	}

	Node newNode  = new Node(data);
	 newNode.next =prevNode.next;
	 prevNode.next = newNode;
	 
}



/**Insert at the end **/
public   void appened(int data) {
	Node newNode = new Node(data); 
	if( head==null) {
		head=newNode;
		return;
	}
	
	newNode.next =null ;/**Make as last node **/
	Node last = head;
	while (last.next!=null ) {
		last  = last.next;
	}
	last.next =newNode;
	return;
}
}
