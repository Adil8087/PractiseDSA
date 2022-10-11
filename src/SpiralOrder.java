import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	public List<Integer> spiralOrder(int[][] matrix) {
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		int dir = 0;
		List<Integer> ans = new ArrayList<>();

		while (left <= right && top <= bottom) {
			switch (dir) {
			case 0:
				for (int i = left; i <= right; i++) {
					ans.add(matrix[top][i]);
				}
				top++;
				break;
			case 1:
				for (int i = top; i <= bottom; i++) {
					ans.add(matrix[i][right]);
				}
				right--;
				break;
			case 2:
				for (int i = right; i >= left; i--) {
					ans.add(matrix[bottom][i]);
				}
				bottom--;
				break;
			case 3:
				for (int i = bottom; i >= top; i--) {
					ans.add(matrix[i][left]);
				}
				left++;
				break;
			}
			dir = (dir + 1) % 4;

		}
		return ans;
	}
}