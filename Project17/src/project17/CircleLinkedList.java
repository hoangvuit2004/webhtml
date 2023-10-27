package project17;

public class CircleLinkedList {
Node pHead;
Node pTail;
public CircleLinkedList() {
	this.pHead = null;
	this.pTail = null;
	
}
public void addNode(int data) {
	Node newNode = new Node(data);
	if(this.pHead == null && this.pTail == null) {
		this.pHead = newNode;
		this.pTail = newNode;
	}else {
		newNode.pNext = this.pHead;
	this.pTail.pNext = newNode;
		this.pHead = newNode;
	}
}
public void prinNode() {
	Node temp = this.pHead;
	while(temp != null) {
		System.out.print(temp.data + " ");
		temp = temp.pNext;
	}
}
public static void main(String[] args) {
	int data = 3;
	int data3 = 4;
	int darta = 6;
	CircleLinkedList s= new CircleLinkedList();
	s.addNode(data3);
	s.addNode(data);
	s.addNode(darta);
	s.prinNode();
}
}
