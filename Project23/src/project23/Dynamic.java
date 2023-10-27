package project23;

public class Dynamic {
public static void print(int array[], int s) {
	int array1[] = new int[s+1];
	for (int i = 0; i < array1.length; i++) {
		array1[i] = 0;
	}
	array1[0] = 1;
	for (int i = 0; i < array.length; i++) {
		for (int j = s; j >=array[i]; j--) {
			if(array1[j-array[i]] == 1 ) {
				array1[j] = 1;
			}
		}
	}
	if(array1[s] == 1) {
		System.out.println("1");
	}else {
		System.out.println("0");
	}
}
public static void main(String[] args) {
	int array[] = new int[]{2,5,3,1};
	int s = 12;
	print(array, s);
}
}
