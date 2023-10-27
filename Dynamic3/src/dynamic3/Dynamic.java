package dynamic3;

public class Dynamic {
public static int maxSubArray(int nums[]) {
	int max = Integer.MIN_VALUE;
	int n = nums.length;
	if(n<=1) {
		return nums[0];
	}
	int array[][] = new int[n+1][n+1];
	for (int i = 1; i <= n; i++) {
		array[0][i] = nums[i-1];
		max = Math.max(max, array[0][i] );
	}
	
	
	for(int len = 1;len < n;len++) {
		for (int i = 1; i <= n - len ; i++) {
			int j = len+i;
			if(len == 1) {
				array[i][j] = nums[i-1] + nums[j-1];
				max = Math.max(max, array[i][j] );
			}else {
				array[i][j] = array[i][j-1] + nums[j-1];
				max = Math.max(max, array[i][j] );
			}
		}
	}
	return max;
}
public static void main(String[] args) {
	int array[] = {123,-1313};
	System.out.println(maxSubArray(array));
}
}
