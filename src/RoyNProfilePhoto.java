import java.util.Scanner;

public class RoyNProfilePhoto {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int L = sc.nextInt();
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				int W = sc.nextInt();
				int H = sc.nextInt();
				if (W < L || H < L)
					System.out.println("UPLOAD ANOTHER");
				else if(H==W)
					System.out.println("ACCEPTED");
				else if( W > L || H > L)
					System.out.println("CROP IT");
			}
		}
	}

}
