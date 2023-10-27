package project21;
public class GreedyCode2 {
	
public static int printMinSumArray(int a[], int b[]) {
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(b[i] < b[j]) {
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}
	}
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum+=(a[i] * b[i]);
	}
	return sum;
}
public static void main(String[] args) {
	int a[] = {1,6,3,5,5,2,2};
	int b[] = {0,1,9,0,1,2,3};
	System.out.println(printMinSumArray(a, b));
		
}
}
