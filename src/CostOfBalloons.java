import java.util.Scanner;

public class CostOfBalloons {

	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in)){
			int testcase=sc.nextInt();
			for(int testloop=0; testloop<testcase; testloop++) {
				int greenPrice=sc.nextInt();
				int purplePrice=sc.nextInt();
				int minPrice=0;
				int noOfCand=sc.nextInt();
				for(int i=0;i<noOfCand;i++) {
					int p1=sc.nextInt();
					int p2=sc.nextInt();
					if(testloop%2==0) {
						if(p1==1)
							minPrice+=greenPrice;
						if(p2==1)
							minPrice+=purplePrice;
					}
					else {
						if(p1==1)
							minPrice+=purplePrice;
						if(p2==1)
							minPrice+=greenPrice;
					}
				}
				System.out.println(minPrice);
			}
		}
	}

}
