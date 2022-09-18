import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "ebcbbececabbacecbbcbe";
		System.out.println(validPalindrome(s));

	}

	public static boolean validPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		int count = 0;
		while (i < j) {
			char c = Character.toLowerCase(s.charAt(i));
			char d = Character.toLowerCase(s.charAt(j));
			char e = Character.toLowerCase(s.charAt(i + 1));
			char f = Character.toLowerCase(s.charAt(j - 1));

			if (i < j && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
				i++;
				j--;
			} else
				return validPalindrome(s, i + 1, j) || validPalindrome(s, i, j - 1);

		}

		return true;

	}

	public static boolean validPalindrome(String s, int i, int j) {
		while (i < j) {
			if (i < j && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}
}
