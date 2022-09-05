
public class CountPalindromeSubstr {

	public static void main(String[] args) {
		System.out.println(CountPS("abbaeae", 7));

	}
	public static int CountPS(String s, int N)
    {
        int palindrome=0;
        for(int i=0;i+1<N;i++){
            for(int j=i+1;j<N;j++){
                String ss=s.substring(i,j+1);
                if(isPalindrome(ss)){
                    palindrome++;
                }
            }
            
        }
        return palindrome;
    }
    
    public static boolean isPalindrome(String substr){
        int i=0;
        int j=substr.length()-1;
        while(i<=j){
            char a=substr.charAt(i);
            char b=substr.charAt(j);
            
        if(a != b ){
            return false;
        }else{
            i++;
            j--;
        }
            
        }
        
        return true;
    }
}
