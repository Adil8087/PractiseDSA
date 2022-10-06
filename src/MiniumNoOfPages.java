import java.util.Arrays;

// problm is similar with minum no days ship wala and minimum of array
public class MiniumNoOfPages {
	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		{ 10 , 15 , 20 };
		int arr[] = {12,34,67,90};
				
		int n = 5;
		Answer answer= new Answer();
		System.out.println(answer.shipWithinDays(arr, n));
	}

	
}
class Answer{
	public int shipWithinDays(int[] weights, int k) {

		int min = maxOf(weights);
		int max = sumOf(weights);
		int res = 0;

		while (min <= max) {
			int mid = (min + max) / 2;
			if (isFeasible(weights, mid, k)) {
				res = mid;
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}

		return res;

	}

	private boolean isFeasible(int[] weights, int res, int k) {
		int count = 1;
		int sum = 0;
		for (int i = 0; i < weights.length; i++) {
			if (sum + weights[i] > res) {
				count++;
				sum = weights[i];
			} else {
				sum += weights[i];
			}
		}
		return count <= k;
	}

	private int sumOf(int[] weights) {
		int sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += weights[i];
		}
		return sum;
	}

	private int maxOf(int[] weights) {
		int max = weights[0];
		for (int i : weights) {
			max = Math.max(max, i);
		}
		return max;
	}
}
