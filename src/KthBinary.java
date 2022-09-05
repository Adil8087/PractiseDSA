import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class KthBinary {

	public static void main(String[] args) {
		try( Scanner sc= new Scanner(System.in)){
			int num=sc.nextInt();
			int k=sc.nextInt();
			int rem=0;
			List<Integer> list=new ArrayList<Integer>();
			while(num>0) {
				rem=num%2;
				list.add(rem);
				num=num/2;
			}
//			while(!st.isEmpty()) {
//				list.add(st.pop());
//			}
			System.out.println(list);
			System.out.println(list.get(k));
		}
			
	}

}
