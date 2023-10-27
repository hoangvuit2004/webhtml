package project22;

public class Dynamic {
public static int dymamic(int array[], int n) {
	int array1[] = new int[n];
	for (int i = 0; i < n; i++) {
		array1[i] = 1;
	}
	for (int i = 1; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if(array[i] > array[j]) {
				array1[i] = Math.max(array1[i],array1[j] + 1 );
			}
		}
	}
	int i = 0;
	int temp = 1;
	while(i<n) {
		if(temp <= array1[i]) {
			temp = array1[i];
			i++;
		}
	}
	
	
	
	
	
	return temp;
}
public static void main(String[] args) {
	int n = 5;
	int array[] = {1,3,2,4,5};
	System.out.println(dymamic(array, n));
}
	

}
