import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String inp = sc.next();
			String copy = "";
			for (int i = inp.length() - 1; i >= 0; i--) {
				char s = inp.charAt(i);
				copy += s;
			}
			if (inp.equals(copy))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
