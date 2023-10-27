package project25;

import java.util.Arrays;

import java.util.Arrays;

public class Dynamic1 {
	public static void largestNumber(int[] nums) {
		String[] numStrings = new String[nums.length];
	    for (int i = 0; i < nums.length; i++) {
	        numStrings[i] = String.valueOf(nums[i]);
	    }

	    // Sắp xếp mảng chuỗi theo thứ tự giảm dần
	    Arrays.sort(numStrings ,(a,b) -> (b+a).compareTo(a + b));
	    for (int i = 0; i < nums.length; i++) {
	       System.out.println(numStrings[i] + " ");
	    }

    }
public static void main(String[] args) {
	int array[] = {3,30,34,5,9};
	//largestNumber(array);
	char a = 'c';
	System.out.println(a - 'a');
	         
}
}
