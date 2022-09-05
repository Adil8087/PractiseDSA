import java.io.*;
import java.util.*;

public class Divisible {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		
//		int[] A = new int[N];
		int aH = (N-1)/ 2;
		int sumOddPlaces=0;
		int sumEvenPlaces=0;
		for (int i = 0; i < N; i++) {
			int k=i+1;
			int num=sc.nextInt();
			if(i>aH) {
				int temp=num%10;
				if(k%2==0)
					sumEvenPlaces+=temp;
				else
					sumOddPlaces+=temp;
			}
			if(i<=aH) {
				int temp=num;
				while(temp!=0) {
					temp=temp/10;
				}
				if(k%2==0)
					sumEvenPlaces+=temp;
				else
					sumOddPlaces+=temp;
				
			}
		}

//		String out_ = solve(A);
//		System.out.println(out_);
//		System.out.println((sumOddPlaces-sumEvenPlaces)%11==0);
		if((sumOddPlaces-sumEvenPlaces)%11==0)
			System.out.println("OUI"); 
		else 
			System.out.println("NON"); ;

		sc.close();
	}

	static String solve(int[] A) {
		// Write your code here
		int aH = (A.length-1)/ 2;
		int num=0;
		for (int i = 0; i <A.length; i++) {
			if(i>aH) {
				int temp=A[i]%10;
				num=num*10+temp;
			}
			if(i<=aH) {
				int temp=A[i];
				while(temp>10) {
					temp=temp/10;
				}
				num=num*10+temp;
			}
		}
		if(num%11==0)
			return "OUI";
		else 
			return "NON";

	}

}
