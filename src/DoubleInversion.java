import java.util.Arrays;
import java.util.Scanner;

public class DoubleInversion {
	static int arr[] = new int[] { 3,4,2,1 };
//	static int arr[] = new int[] { 1,2,4,3 };
	static int getInvCount(int n) {
		int inv_count = 0;
		for (int i = 1; i < n ; i++) {
			int inv_countI = 0;
			for (int j = 0; j < i; j++)
				if (arr[i] < arr[j]) {
					inv_count++;
					inv_countI++;
				}
			System.out.println("i: "+i+ " inv_count: "+ inv_countI );
		}

		return inv_count;
	}

	public static void main(String[] args) {
		System.out.println("Number of inversions are " + getInvCount(arr.length));
//	/*	
		try (Scanner sc=new Scanner(System.in)){
			int cases=sc.nextInt();
			for(int l=0;l<cases;l++) {
				int n=sc.nextInt();
				int[] IA=new int[n];
				int[] IR=new int[n];
				for(int m=0;m<n;m++) {
					IA[m]=sc.nextInt();
				}
				for(int m=0;m<n;m++) {
					IR[m]=sc.nextInt();
				}
				int[] answer=new int[n];
				Arrays.fill(answer, l);
				for(int i=IA.length-1;i>=0;i--) {
					int n=IA[i];
					for(int j=0;j<i;j++)
					{
						answer[i]+=n;
					}
				}
			}
			
		}
//		*/
	}
}
