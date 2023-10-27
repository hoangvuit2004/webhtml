package project17;

public class DoubleLinkedList {
Node pHead;
public DoubleLinkedList() {
	this.pHead = null;
}
public void addNode(int data) {
	Node newNode = new Node( data);
	if(this.pHead == null) {
		this.pHead = newNode;
	}else {
		newNode.pNext = this.pHead;
		this.pHead.pPrev = newNode;
		this.pHead = newNode;
	}
}
public void printNode() {
	Node temp = this.pHead;
	while(temp != null) {
		System.out.print(temp.data + " ");
		temp = temp.pNext;
	}
}
public void printPreNode() {
	Node temp = this.pHead;
	while(temp.pNext != null) {
		temp = temp.pNext;
	}
	while(temp != null) {
		System.out.print(temp.data + " ");
		temp = temp.pPrev;
	}
}

public static void main(String[] args) {
	DoubleLinkedList s = new DoubleLinkedList();
	
	int data  = 3;
	int data2 = 4;
	s.addNode(data);
	s.addNode(data2);
	s.printNode();
	System.out.println();
	s.printPreNode();
}
}
