import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		double []arr=new double[N];
		double answer=1;
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextDouble();
			answer=(answer*arr[i])%(Math.pow(10, 9)+7);
		}
		System.out.println((int)answer);
	}

}
