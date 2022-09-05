import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	public static void main(String[] args) {
		String s="";
		int start=0;
		int end=0;
		int length=0;
		
		Map<Character, Integer> map =new HashMap<Character, Integer>();
		for(end=0;end<s.length();end++) {
			char c= s.charAt(end);
			if(map.containsKey(c)) {
				if(start<=map.get(c)) {
					start=start+1;
				}
			}
			length=Math.max((end-start+1), length);
			map.put(c, end);
					
		}
		System.out.println(length);
		
	}
}
