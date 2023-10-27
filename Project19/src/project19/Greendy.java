package project19;

import java.util.Scanner;

public class Greendy {
public static void print(int n , int m) {
	if(n % (m+1) == 0) {
		System.out.println("Ban thua");
	}else {
		System.out.println("Ban thang");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao so da: ");
	int n = sc.nextInt();
	System.out.println("Nhap vao so boc da: ");
	int m = sc.nextInt();
	print(n, m);
}
}
