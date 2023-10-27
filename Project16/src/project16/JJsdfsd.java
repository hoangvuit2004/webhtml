package project16;

public class JJsdfsd {
	public static  void sortArray(int array[], int n) {
		int temp ;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		//printArray(array);
	}
	public static   void printArray(int array[]) {
		for (int  iterable_element : array) {
			System.out.print(iterable_element + " ");
		}
	}
	public static int asdasd(int n) {
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		int array[] = {5,4,4,76,7,43,87,8};
		int n = 105;
		//sortArray(array, n);
		//printArray(array);
		
		System.out.println(asdasd(n));
	}
}
