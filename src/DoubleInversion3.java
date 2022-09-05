import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DoubleInversion3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int num = Integer.parseInt(br.readLine());
			for (int k = 0; k < num; k++) {
				int noOfInt = Integer.parseInt(br.readLine());
				String[] normal = br.readLine().split(" ");
				String[] reverse = br.readLine().split(" ");

				String og = getOriginalArray(normal, reverse, noOfInt);
				System.out.println(og);
			}
		}

	}

	private static String getOriginalArray(String[] normal, String[] reverse, int length) {
		if (Integer.parseInt(normal[0]) != 0 || Integer.parseInt(reverse[0]) != 0) {
			return "-1";
		}
		StringBuilder answer = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < reverse.length; i++) {
			
			int lvalue = Integer.parseInt(normal[i]);
			int rvalue = Integer.parseInt(reverse[reverse.length - 1 - i]);
			int tsum = lvalue + rvalue;
			if (tsum > length - 1)
				return "-1";
			int tvalue = length - tsum;
			sum += tvalue;
			
			answer.append(" " + tvalue);

		}
		if(sum != length * (length + 1) / 2) {
            return "-1";
        }
 
        return answer.toString().trim();
		
	}

}
