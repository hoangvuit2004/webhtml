package project21;

public class GreedyCode3 {
public static long fibonacci(int n) {
	long array[] = new long[n+1];
	array[0] = 0;
	if(n > 0) {
		array[1] = 1;
		for (int i = 2; i <=n; i++) {
			array[i] = array[i-1] + array[i-2];
		}
	
	}
	return array[n];
}
public static int fibo(int n) {
	if(n<=1) {
		return n;
	}
	return fibo(n-1) + fibo( n-2);
	
}
public static void main(String[] args) {
int   n =0;
long start  = (long)System.currentTimeMillis();
System.out.println(fibonacci(n));
long end = (long)System.currentTimeMillis();
System.out.println(end - start);
long start1  = (long)System.currentTimeMillis();
System.out.println(fibo(n));
long end1 = (long)System.currentTimeMillis();
System.out.println(end1 - start1);
}
}
