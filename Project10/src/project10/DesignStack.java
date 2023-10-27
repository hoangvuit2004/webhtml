package project10;

import javax.imageio.IIOException;

public class DesignStack {
	int []stack;
	int size;
	int count;
	public DesignStack() {
		size = 5;
		stack = new int[size];
		count = 0;
	}
	public void addStack(int data) {
		if(count == size) throw new ArithmeticException("Vuot qua gioi han cua mang");
		
		stack[count] = data;
		count++;
	}
	public boolean isEmpty() {
		return count-1 ==-1;
	}
	public void printStack() {
		for (int i = size-1; i >= 0 ; i--) {
			System.out.print(stack[i]+ " ");
		}
	}
	public void removeStack() {
		count--;
		size--;
	}
	public void peek() {
		System.out.print("\n"+stack[count-1]);
	}
	public boolean isFull() {
		return count == size ? true : false;
	}
public static void main(String[] args) {
	DesignStack de = new DesignStack();
	System.out.println(de.isEmpty());
	de.addStack(1);
	de.addStack(2);
	de.addStack(3);
	de.addStack(4);
	de.addStack(5);
	de.printStack();
	de.peek();
	System.out.println(de.isFull());
	
	
}
}
