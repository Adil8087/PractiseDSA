
public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,18,17,6};
		System.out.println(maxArea(arr));
	}

	private static int maxArea(int[] arr) {
		
		int lHieght=0;
		int rHieght= arr.length-1;
		int sum=0;
		while(lHieght < rHieght) {
			int min_h= Math.min(arr[lHieght], arr[rHieght]);
			int length= rHieght-lHieght;
			sum= Math.max(sum, (min_h*length));
			
			if(arr[lHieght]< arr[rHieght])
				lHieght++;
			else
				rHieght--;
			
		}
		
		return sum;
	}
	
	
}
