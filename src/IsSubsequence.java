import java.util.Arrays;

public class IsSubsequence {
	
	public boolean isSubsequence(String s, String t) {
	    if(s.length() > t.length())
	    	return false;
		
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();
        int i=0;
        int j=0;
        while(i<s1.length && j<t1.length ) {
        	if(s1[i] == t1[i]) {
        		i++;
        		j++;
        	}else
        		j++;
        }
        
        if(i == s1.length)
        	return true;
		return false;
    }

}
