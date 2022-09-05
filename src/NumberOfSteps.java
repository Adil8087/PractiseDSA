
import java.util.Scanner;

public class NumberOfSteps {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int column = sc.nextInt();
			int a[] = new int[column];
			int b[] = new int[column];
			int min = 5001;
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if (a[i] < min)
					min = a[i];
			}
			for (int i = 0; i < b.length; i++)
				b[i] = sc.nextInt();
			for (int i = 0; i < a.length; i++) {
				
				while (a[i] >= b[i] && a[i] > min) {
					a[i] = a[i] - b[i];
					count++;
				}
				if(a[i]<min && a[i]>0) {
					min=a[i];
					i=-1;
				}
				else if (a[i]<0 || a[i]!=min) {
					count=-1;
					break;
				}
			}
			System.out.println(count);

		}
	}

}
