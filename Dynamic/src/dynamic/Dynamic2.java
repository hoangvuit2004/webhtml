package dynamic;

import java.util.Arrays;

public class Dynamic2 {
	 public  static int jump(int[] nums) {
         int n = nums.length;
        int jumps = 0; // Number of jumps
        int maxReach = 0; // Maximum reach from the current jump
        int currEnd = 0; // Current end of the jump

        for (int i = 0; i < n - 1; i++) {
            // Update the maximum reach from the current jump
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we have reached the current end of the jump, make a jump
            if (i == currEnd) {
                jumps++;
                currEnd = maxReach; // Set the current end of the jump to the maximum reach
            }
        }

        return jumps;
    }
	 public static void print(int []nums) {
		 int n = nums.length;
	        int[] dp = new int[n]; // Mảng dp để lưu số lần nhảy tối thiểu tại mỗi vị trí
	        
	        // Khởi tạo giá trị ban đầu cho mảng dp
	        Arrays.fill(dp, Integer.MAX_VALUE);
	        dp[0] = 0; // Số lần nhảy tại vị trí đ
	        System.out.println(dp[1]);
	 }
	 public static void main(String[] args) {
		int array[] = {2,8,1,5,2,2,7};
		System.out.println(jump(array));
		print(array);
	}
}
