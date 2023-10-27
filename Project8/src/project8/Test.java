package project8;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void print() {
		System.out.println("Xin moi nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Ten cua ban la: " + name);
	}
public static void main(String[] args) {
	print();
}
}
