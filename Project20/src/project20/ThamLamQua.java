package project20;

public class ThamLamQua {
public static int min(int a) {
	if(a==6) {
		return 5;
	}
	return a;
}
public static int max(int a) {
	if(a==5) {
		return 6;
	}
	return a;
}
public static int printMax(int a, int b) {
	int m = 1;
	int sum = 0;
	while(a > 0 || b>0) {
		int ditgitA = a%10;
		int ditgitB = b%10;
int c = max(ditgitA);		
int d = max(ditgitB);
sum+=(c+d) * m;
a/=10;
b/=10;
m*=10;
	}
	return sum;
}
public static int printMin(int a, int b) {
	int m = 1;
	int sum = 0;
	while(a > 0 || b>0) {
		int ditgitA = a%10;
		int ditgitB = b%10;
int c = min(ditgitA);		
int d = min(ditgitB);
sum+=(c+d) * m;
a/=10;
b/=10;
m*=10;
	}
	return sum;
}
public static  void printSum() {
	int a  = 11;
	int b = 25;
	System.out.println("Tong lon nhat la: " + printMax(a, b));
	System.out.println("Tong lon nhat la: " + printMin(a, b));
}
public static void main(String[] args) {
	printSum();
}
}
