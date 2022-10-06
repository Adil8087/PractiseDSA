
public class StringPermuation {
	public boolean checkInclusion(String s1, String s2) {
        checkPermutations(s1,s2,0,s1.length());
		return false;
        
    }

	private static boolean checkPermutations(String s1, String s2, int idx, int length) {

		if(idx== length) {
		 if(s2.contains(s2)) return true;	
		}
		return false;
		
	}
}
