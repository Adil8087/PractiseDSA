import java.util.Scanner;

public class BI2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int totNum = sc.nextInt();
			int[] arr = new int[totNum];
			for (int i = 0; i < totNum; i++) {
				arr[i] = sc.nextInt();
			}
			long max = Long.MIN_VALUE;

			for (int i = 0; i < arr.length; i++) {

				long sum = 0;

				int left = arr.length - i;

				int vo = 1;

				int k = i;

				while (left > 0) {

					for (int j = 0; j < vo; j++) {

						sum += (long) arr[k++];

					}

					vo++;

					left -= vo;

				}

				if (max < sum)
					max = sum;

			}

			System.out.println(max);

		}

	}
}
