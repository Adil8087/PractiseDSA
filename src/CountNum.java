import java.util.Arrays;
import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner s = new Scanner(System.in)) {
			String name = s.nextLine();
			int count[] = new int[10];
			Arrays.fill(count, 0);
			for (int i = 0; i < name.length(); i++) {
				int n = name.charAt(i) - '0';
				count[n]++;
			}
			for(int i=0;i<count.length;i++) {
				System.out.println(i +" "+ count[i]);
			}
		}
	}

}
