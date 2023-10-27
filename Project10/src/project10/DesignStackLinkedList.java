package project10;

import java.util.NoSuchElementException;

public class DesignStackLinkedList {
	Node pHead;
	public DesignStackLinkedList() {
		this.pHead = null;
	}
	public void addHead(int data) {
		Node newNode = new Node(data);
		if(this.pHead == null) {
			this.pHead = newNode;
		}else {
			newNode.pNext = this.pHead;
			this.pHead = newNode;
		}
	}
	public void printNode() {
		Node current = this.pHead; 
		if(current == null) throw new NullPointerException();
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.pNext;
		}
		
		
	}
	public void removeHead() {
		if(this.pHead == null) {
			return ;
		}else if (this.pHead.pNext != null){
			 this.pHead = this.pHead.pNext;
		}else {
			this.pHead = null;
		}
	}
	public boolean isEmpty() {
		return this.pHead == null ? true : false;
	}
	public int peek() {
		if (this.pHead != null) {
	        return this.pHead.data;
	    }
		throw new NoSuchElementException("NULL KIA MA");
	}
class Node{
	int data;
	Node pNext;
	public Node(int data) {
		this.data = data;
		this.pNext = null;
	}
}

	


public static void main(String[] args) {
	DesignStackLinkedList link = new DesignStackLinkedList();
link.addHead(3);
	
	
	link.printNode();
	
}

}
