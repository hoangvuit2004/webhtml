package project22;

import java.util.Iterator;

public class DynamicIsland {
	static int temp = 0; ;
public static int dynamic(int weigth[], int []value, int n, int s) {
	int array[][] = new int[n+1][s+1];
	for (int i = 0; i <= n ; i++) {
		for (int j = 0; j <=s; j++) {
			if(i== 0 || j == 0) {
				array[i][j] = 0;
			}else if(j < weigth[i-1]) {
				array[i][j] = array[i-1][j];
			}else {
				array[i][j] = Math.max(array[i-1][j], value[i-1] + array[i-1][j - weigth[i-1]]);
			}
		}
	}
	return array[n][s];
}
public static int fibo(int n) {
	if(n<=1) {
		return n;
	}
	int a = 0;
	 int b = 1;
for (int i = 2; i <= n ; i++) {
	temp = a+b;
	a= b;
	b= temp;
	
}
return b;
}
public static void main(String[] args) {
	int w[] = {1,2,4,5};
	int v[] = {3,2,3,4};
	int n = 4;
	int s = 6;
	System.out.println(dynamic(w, v, n, s));
	int a = 6;
	System.out.println(fibo(a));
}
}
