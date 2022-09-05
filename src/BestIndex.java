import java.util.Scanner;

public class BestIndex {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int totNum=sc.nextInt();
			int[] arr=new int[totNum];
			int max=0;
			for(int i=0;i<totNum; i++) {
				arr[i]=sc.nextInt();
			}
			//  --done till here
			// Sample test run 
			//3
//			-3 2 3 -4 3 1
			for(int i=0;i<totNum; i++) {
				int BI=0;
				int n=0;
				if(i+2 >totNum-1) {
					BI=arr[i];	
				}
				while(i+n+2<totNum) { // 1. 0+0+2 <6 {BI=a0+1+2; 2.0+3+2 <6
					 
						BI+=arr[i+n];   //n 0 + 1 + 2 /n=3  2.0+3 0+4 0+5 
						n++;
					
					
				}
				if(BI>max)
					max=BI;
			}
			System.out.println(max);
		}
	}

}
