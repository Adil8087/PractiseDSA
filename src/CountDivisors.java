import java.util.Scanner;

public class CountDivisors {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			int l=sc.nextInt();
			int m=sc.nextInt();
			int n=sc.nextInt();
			int count=0;
			while (l<=m) {
				if(l%n==0)
					count++;
				l++;
			}
			System.out.println(count);
		}
	}

}
