package project21;

public class GreedyCode1 {
public static boolean printArraySort(int a[], int n) {
	int mid = n/2;
	int i = mid-1;
	int j = mid+1;
	while(i>0 && j < n-1 ) {
		int temp ;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i--;
		j++;
		
	}
	for (int j2 = 1; j2 < n; j2++) {
		if(a[j2] < a[j2-1]) {
			return false;
			
		}
		
	}
	return true;
		
}
public static  void checkArraySort(int a[], int n) {
	if(printArraySort(a, n)) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
}
public static void main(String[] args) {
	int a[] = {1,6,5,4,3,2,7};
	int n = 7;
	checkArraySort(a, n);
}
}
