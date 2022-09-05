import java.util.Arrays;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ratings[]= {1,3,4,5,2};
		
//		if (ratings == null || ratings.length == 0) {
//	        return 0;
//	        }
	        int n =ratings.length;                        //[1,3,4,5,2]
	        int[] candies = new int[ratings.length];      //[1 0 0 0 0]
	        candies[0] = 1;
	        for(int i=1;i<n;i++){ 
	            if(ratings[i]>ratings[i-1]){
	                candies[i]=candies[i-1]+1;       //[1 2 3 4 0]
	            }else
	                candies[i]=1;                   //[1 2 3 4 1]
	        }
	        for(int i=n-2;i>=0;i--){ 
	        	//[1 2 3 4 1]

	        	int cur = 1;
	        	if(ratings[i]>ratings[i+1]){
	                cur=candies[i+1]+1;
	                candies[i]=Math.max(candies[i], cur);
	            }
	        }
	        
	        System.out.println(Arrays.stream(candies).sum());

	}

}
