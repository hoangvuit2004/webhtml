package project17;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] islandGrid = {
        		{1,1,0,1,0,0,1,0,0,0},
        		{1,1,0,1,0,0,0,1,1,1},
        		{0,0,1,1,1,0,0,0,0,0},
        		{0,0,1,1,1,1,1,1,1,0},
        		{0,0,0,0,0,0,0,1,1,0},
        		{1,1,1,1,1,1,1,0,0,0}
        };
       System.out.println(islandGrid[0].length);

        int maxIslandArea = getLargestRectangleArea(islandGrid);
        System.out.println("Diện tích lớn nhất của các đảo có dạng chữ nhật là: " + maxIslandArea);
    }

    public static int getLargestRectangleArea(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int row = 0; row < rows; row++) {
            // Cập nhật chiều cao của các cột dựa trên hàng hiện tại
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    heights[col] += 1;
                } else {
                    heights[col] = 0;
                }
            }

            // Tính diện tích lớn nhất của đảo có dạng chữ nhật trên hàng hiện tại
            maxArea = Math.max(maxArea, getMaxRectangleArea(heights));
        }

        return maxArea;
    }

    public static int getMaxRectangleArea(int[] heights) {
        int maxArea = 0;
        int i = 0;
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // Tìm vị trí bên trái đầu tiên có chiều cao nhỏ hơn
        Stack<Integer> stack = new Stack<>();
        for (i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Đặt lại stack và tìm vị trí bên phải đầu tiên có chiều cao nhỏ hơn
        stack.clear();
        for (i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Tính diện tích lớn nhất từ các hình chữ nhật
        for (i = 0; i < n; i++) {
            int area = heights[i] * (right[i] - left[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}