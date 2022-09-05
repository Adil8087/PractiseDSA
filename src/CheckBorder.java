import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckBorder {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int lines=sc.nextInt();
			for(int i=0;i<lines;i++) {
				int rows=sc.nextInt();
				int columns=sc.nextInt();
				String[] arr= new String[rows];
				for(int j=0;j<rows;j++) {
					arr[j]=sc.next();
				}
				
				List<Integer> list=new ArrayList<>();
				for(int k=0;k<rows;k++) {
					int count=0;
					for(int j=0;j<columns;j++) {
						if(arr[k].charAt(j)=='#')
							count++;
					}
					list.add(count);
				}
				System.out.println(Collections.max(list));
				}
			}
	}

}
