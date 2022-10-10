
public class NoOfIslands {

	public int noOfIsland(char[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		boolean isVisited[][] = new boolean[m][n];
		int totalIsland = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!isVisited[i][j] && grid[i][j] == '1') {
					dfs(grid, i, j, isVisited);
					totalIsland++;
				}
			}
		}

		return totalIsland;

	}

	private void dfs(char[][] grid, int row, int col, boolean[][] isVisited) {

		if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || isVisited[row][col]
				|| grid[row][col] == '0') {
			return;
		}
		isVisited[row][col] = true;
		dfs(grid, row, col - 1, isVisited);
		dfs(grid, row - 1, col, isVisited);
		dfs(grid, row, col + 1, isVisited);
		dfs(grid, row + 1, col, isVisited);

	}
}
