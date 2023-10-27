package project17;

public class Node {
int data;
Node pNext;
Node pPrev;
public Node(int data) {
	this.data = data;
	this.pNext = null;
	this.pPrev = null;
}
public static void main(String[] args) {
	  int n = 12345;

      while (n != 0) {
          int digit = n % 10;
          System.out.print(digit + " ");
          n /= 10;
      }
}
}
