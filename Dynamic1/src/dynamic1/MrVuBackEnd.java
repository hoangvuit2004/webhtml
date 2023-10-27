package dynamic1;

public class MrVuBackEnd {
public static int maxSumArray(int array[]) {
	int temp = 0;
	int max = Integer.MIN_VALUE;
	for (int i = 1; i < array.length; i++) {
		temp = 0;
		for (int j = 0; j <=i; j++) {
			temp+=array[j];
		}
		max = Math.max(max, temp);
	}
	return max;
}
public static void main(String[] args) {
	int array[] = {1,2,3,-1};
	System.out.println(maxSumArray(array));
	
}
}
