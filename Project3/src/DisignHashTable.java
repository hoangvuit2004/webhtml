
public class DisignHashTable {
	private final int SIZE = 1000;
	Node pHeads[];
class Node{
	int data;
	Node pNext;
	public Node(int data) {
		this.data = data;
		this.pNext = null;
	}
}
public DisignHashTable() {
	pHeads = new Node[SIZE];
	for (int i = 0; i < SIZE; i++) {
		pHeads[i] = null;
	}
}

public int hashFunction(int key) {
	return key%7;
	
}
public void insertNode(int data) {
	int hashIndex = hashFunction(data);
	Node r = pHeads[hashIndex];
	Node prev = null;
	while(r!=null && r.data < data) {
		prev = r;
		r = r.pNext;
	}
	Node newNode = new Node(data);
	if(prev == null) {
		newNode.pNext = r;
		pHeads[hashIndex] = newNode;
		
	}else if(r==null) {
		prev.pNext= newNode;
	}else {
		newNode.pNext = r;
		prev.pNext = newNode;
	}
}
public void printNode() {
	
		for (int i = 0; i < SIZE; i++) {
			if(pHeads[i] != null) {
				System.out.println("\nBucket " + i  );
				Node p = pHeads[i];
				while(p!=null) {
					System.out.print(p.data + "\t");
					p = p.pNext;
				}
			}
		}
	}
public Node containsKey(int data) {
	int hashIndex = hashFunction(data);
	Node r = pHeads[hashIndex];
	while(r!= null && r.data != data) {
		r= r.pNext;
	}
	return r;
}
public void removeNode(int data) {
	int hashIndex = hashFunction(data);
	Node r = pHeads[hashIndex];
	Node prev = null;
while(r!=null && r.data != data) {
	prev = r;
	r = r.pNext;
	
}
if(r==null) {
	return ;
}
if(prev == null) {
	pHeads[hashIndex] = r.pNext;
}else {
	prev.pNext = r.pNext;
}
	
}
public static void main(String[] args) {
	DisignHashTable s = new DisignHashTable();
	s.insertNode(8);
	s.insertNode(4);
	s.insertNode(9);
	s.insertNode(3);
	s.insertNode(15);
	s.insertNode(18);
	s.insertNode(26);
	s.printNode();
	if(s.containsKey(8) != null) {
		System.out.println("Có phần tử thứ 8");
	}
	s.removeNode(8);
	s.printNode();
}
}
