import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			String s=sc.next();
			int zCount=0;
			int oCount=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='z')
					zCount++;
				if(s.charAt(i)=='o')
					oCount++;
			}
			
			if(oCount==zCount*2)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
