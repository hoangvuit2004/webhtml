package project19;

import java.util.Scanner;

public class ChatGPT {
	Scanner sc = new Scanner(System.in);
	int n, m;
public void UserPlay() {
	System.out.println("Nhap vao so da ban muon boc: ");
	int b  = sc.nextInt();
	if(b > m ) {
		System.out.println("Sai so luong: ");
		UserPlay();
	}
	n-=b;
}
public void showPlay() {
	System.out.println("So luong da con lai la: " + n);
}
public void botPlay() {
	if(n%(m+1) == 0) {
		System.out.println("Bot boc 1 vien");
	 n--;	
	}else {
		int x = n%(m+1);
		System.out.println("Bot boc " + n + "vien");
		n-=x;
	}
	
}
public  void play() {
	System.out.println("Nhap vao so luong da can choi: ");
	 n = sc.nextInt();
	System.out.println("Nhap vao luong da duoc boc toi da: ");
	  m = sc.nextInt();
	while(true) {
		UserPlay();
		showPlay();
		if(n==0) {
			System.out.println("Ban thang");
			return;
		}
		botPlay();
		showPlay();
		if(n==0) {
			System.out.println("Bot thang");
			return;
		}
	}
	}
public static void main(String[] args) {
	ChatGPT s = new ChatGPT();
	s.play();
}
}
