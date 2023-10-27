package project11;

public class DesignQueue {
	private Node pHead;
	private Node pTail;
	public DesignQueue() {
		this.pHead = this.pTail = null;

	}

	public void addTail(int data) {
		Node newNode = new Node(data);
		if (this.pHead == null) {
			this.pHead = this.pTail = newNode;
		} else {
		
			this.pTail.pNext = newNode;
			this.pTail = newNode;
			
		}

	}

	public void printNode() {
		if (this.pHead == null) {
			throw new NullPointerException("Null rồi má ");
		} else {
			Node temp = this.pHead;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.pNext;
			}
		}

	}

	public int peek() {
		if (this.pHead == null) {
			throw new NullPointerException("Null rồi má ");
		} else {
			Node change = this.pHead;
			return change.data;
		}
	}

	public boolean isEmtry() {
		return this.pHead == null;
	}

	public int poll() {
		Node change;
		if (this.pHead == null) {
			throw new NullPointerException("Null rồi má ");
		} else {
			change = this.pHead;
			if (this.pHead.pNext != null) {
				this.pHead = this.pHead.pNext;
			} else if (this.pHead != null) {
				this.pHead = null;
			}
		}

		return change.data;

	}

	public void removeNodeIndex(int indexData) {
		Node change = this.pHead;
		while (change.pNext.data != indexData) {
			change = change.pNext;
		}
		if (change.pNext.data == indexData) {
			change.pNext = change.pNext.pNext;
			
		}
	}
public void addIndexNode(int data, int index) {
	Node newNode = new Node(data);
	Node change = null;
	Node temp = this.pHead;
	for (int i = 0; i < index; i++) {
		change = temp;
		temp = temp.pNext;
	}
	newNode.pNext = temp;
	change.pNext = newNode;
	
	
}
	public static void main(String[] args) {
		DesignQueue list = new DesignQueue();
		System.out.println();
		list.addTail(1);
		list.addTail(2);
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		int data = 9;
		int index = 2;
		list.addIndexNode(data, 2);
		list.printNode();

	}
}
