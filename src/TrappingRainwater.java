
public class TrappingRainwater {
	
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
	}
	
	public static int trap(int[] height) {
        int n= height.length;
        int[] lHigh= new int[n];
        int[] rHigh= new int[n];
        
        int high = height[0];
        int high2= height[n-1];
        for(int i=0;i<n;i++){
            lHigh[i]= Math.max(high, height[i]);
            high= lHigh[i];
        }
        for(int k=n-1; k>=0;k--){
            rHigh[k]=Math.max(high2, height[k]);
            high2= rHigh[k];
        }
        int sum=0;
        for(int ii=0;ii<n;ii++){
            sum +=Math.min(lHigh[ii], rHigh[ii])-height[ii];
        }
        
        return sum;
        
        /*
         * 
        0 1 2 3 4 5 6 7 8 9 10 11 12
		0,1, 0,2,1,0,1,3,2,1,2,1
		0 1 1 2 2 2 2 3 3 3 3  3   3   3  
		3 3 3 3 3 3 3 3 3 3 3 2   2    2   1             
 
 		0 0 1 0 1 2 1 0 0 1 00 
         */
        
        
    }

}
