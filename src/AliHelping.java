import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AliHelping {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String tagName = br.readLine();
			List<Character> list = new ArrayList<Character>();
			list.add('A');
			list.add('E');
			list.add('I');
			list.add('O');
			list.add('U');
			list.add('Y');
			int i = 0;
			boolean valid = false;
			while (i < tagName.length() - 1) {
				if (i == 1 || i == 2 || i == 5 || i == 6) {
					if (i == 2) {
						if (list.contains(tagName.charAt(i))) {
							valid = false;
							break;
						} // 22X242-67 check karna h}
						else {
							valid = true;
						}

					}
					i++;
					continue;
				} else {
					int n = (tagName.charAt(i) - '0') + (tagName.charAt(i + 1) - '0');

					if (n % 2 == 0)
						valid = true;
					else {
						valid = false;
						break;
					}
					i++;
				}
			}
			if (valid)
				System.out.println("valid");
			else
				System.out.println("invalid");

		}
	}

}
