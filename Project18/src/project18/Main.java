package project18;

public class Main {
	static int count =0;
	static int maxValue = 0;
    public static void main(String[] args) {
        int[][] islandGrid = {
        		{1, 1, 0, 1, 1, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {1, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
            };
            

            int maxArea = getMaxIslandArea(islandGrid);
            System.out.println(" Số lượng đảo có diện tích lớn nhất trong quần đảo là :  " + maxArea);
        }

        public static int getMaxIslandArea(int[][] grid) {
            int maxArea = 0;
            int rows = grid.length;
            int cols = grid[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == 1) {
                        int area = calculateIslandArea(grid, i, j);
                        if(area > 1) {
                        	count++;
                        }
                        int temp = area;
                        if(maxArea < temp) {
                        	maxValue = 1;
                        	maxArea = temp;
                        }else if(maxArea == temp) {
                        	maxValue++;
                        }
                         
                    }
                }
            }

            return maxValue  ;
        }

        public static int calculateIslandArea(int[][] grid, int row, int col) {
            if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1) {
                return 0;
            }
           grid[row][col] = 0;
            int area = 1;

            area += calculateIslandArea(grid, row + 1, col);
            area += calculateIslandArea(grid, row - 1, col);
            area += calculateIslandArea(grid, row, col + 1);
            area += calculateIslandArea(grid, row, col - 1);

            return area;
        }
        
    }