import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in)){
			String inp=sc.next();
			String copy="";
			for (int i = 0; i < inp.length(); i++) {
				if(inp.charAt(i)>='a' &&inp.charAt(i)<='z') {
					char s=(char)(inp.charAt(i)-32);
					copy+=s;
							//char ch = (char)(st.charAt(i) - 32);
				}else
				{
					char s=(char)(inp.charAt(i)+32);
					copy+=s;
				}
			}
			System.out.println(copy);
		}
	}	

}
