import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int [] nums= {-1,0,1,2,-1,-4};
		System.out.print(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return Collections.emptyList();
       
       Arrays.sort(nums);
       
       List<List<Integer>> list= new ArrayList<>();
       for(int i=0;i<nums.length-2;i++){
           
           int L = i+1;
           int R = nums.length -1;
           
           while(L < R){
               int sum =nums[L] + nums[R] + nums[i];
               if( sum == 0){
                   list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                   while(L < R && nums[L] == nums[L + 1]) ++L;
                   L++;
                   R--;
               }else if(sum < 0)
                   L++;
               else
                   R--;
               
           }
           while(i < nums.length - 1 && nums[i] == nums[i + 1]) ++i;
       }
        return list;
   }
  	

}
