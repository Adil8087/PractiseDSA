import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhoneNumber {
	List<String> ans = new ArrayList<>();

	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0)
			return ans;

		HashMap<Character, String> map = new HashMap<>();
		map.put('2', "bcd");
		map.put('3', "efg");
		map.put('4', "hij");
		map.put('5', "klm");
		map.put('6', "nop");
		map.put('7', "qrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		sumCombination(digits, 0, map, new StringBuilder(), ans);
		return ans;
	}

	private void sumCombination(String digits, int i, HashMap<Character, String> map, StringBuilder sb,
			List<String> ans) {
		if (i == digits.length()) {
			ans.add(sb.toString());
			return;
		}
		String curr = map.get(digits.charAt(i));
		for (int k = 0; k < curr.length(); k++) {
			sb.append(curr.charAt(k));
			sumCombination(digits, i + 1, map, sb, ans);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
