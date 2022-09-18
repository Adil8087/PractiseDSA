import java.util.Arrays;

public class ProductArrayExceptSelf {
	public static void main(String[] args) {
		int [] nums= {-1,0,1,2,-1,-4};
		int [] nums2=productExceptSelf(nums);
		 System.out.print("fsfaf");
		
		
		
	}

	 public static int[] productExceptSelf(int[] nums) {
	        int []ans= new int[nums.length];
	        Arrays.fill(ans, 1);
	     
	        int p=1;
	        int n= nums.length;
	        
	        for(int i=0;i<n;i++) {
	        	ans[i]=p;
	        	p=p*nums[i];
	        }
	         p=1;
	        for(int j=n-1; j>=0; j--) {
	        	ans[j] *= p;
	        	p=p*nums[j];
	        }
	        return ans;
	    }
	
}
