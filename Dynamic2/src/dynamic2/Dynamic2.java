package dynamic2;

import java.util.Iterator;

public class Dynamic2 {
public static  int uniquePaths(int m, int n) {
	int array[][] = new int[m][n];
	for(int i = 0; i< n;i++) {
		array[0][i] = 1;
	}
	for (int i = 0; i < m; i++) {
		array[i][0] = 1;
	}
	for (int i = 1; i < m; i++) {
		for (int j = 1; j < n; j++) {
			array[i][j] = array[i-1][j] + array[i][j-1];
		}
	}
        return array[m-1][n-1];
    }
public static  int uniquePathsWithObstacles(int[][] obstacleGrid) {
	int m = obstacleGrid.length;
	int n = obstacleGrid[0].length;
	int array[][] = new int[m][n];
	if(obstacleGrid[0][0] == 1) {
		return 0;
	}
	System.out.println(array[1][1]);
	for (int i = 0; i < n; i++) {
		if(obstacleGrid[0][i] != 1) {
			array[0][i] = 1;
		}
	}
	for (int i = 0; i < m; i++) {
		if(obstacleGrid[i][0] != 1) {
			array[i][0] = 1;
		}
	}
	for (int i = 1; i < m ; i++) {
		for (int j = 1; j < n; j++) {
			if(obstacleGrid[i][j] != 1) {
				array[i][j] = array[i-1][j] + array[i][j-1];
			}
			
		}
	}
    return array[m-1][n-1];
}
public static  int minPathSum(int[][] grid) {
    int m = grid.length;
    int n  = grid[0].length;
    int array[][] = new int[m][n];
    array[0][0] = grid[0][0];
    for (int i = 1; i < m; i++) {
		array[i][0] = array[i-1][0] + grid[i][0];
	}
    for (int i = 1; i < n; i++) {
		array[0][i] = array[0][i-1] + grid[0][i];
	}
    for (int i = 1; i < m; i++) {
		for (int j = 1; j < n ; j++) {
			array[i][j] = Math.min(array[i-1][j], array[i][j-1]) + grid[i][j];
		}
	}
    return array[m-1][n-1];
}
public static void main(String[] args) {
	int array[][] = {{1,3,1},{1,5,1},{4,2,1}};
	System.out.println(minPathSum(array));
}
}
