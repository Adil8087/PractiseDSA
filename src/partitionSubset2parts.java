import java.util.HashMap;

public class partitionSubset2parts {

	 public boolean canPartition(int[] nums) {
	        int total=0;
	        for (int value : nums) {
	            total += value;
	        }
	        
	        if(total % 2 !=0){
	            return false;
	        }
	        return canPartition(nums,0,0,total, new HashMap<String, Boolean>());
	    }
	    private boolean canPartition(int[] nums, int index, int sum , int total,HashMap<String, Boolean> state){
	        String current=index+"-"+sum;
	        if(state.containsKey(current)){
	            return state.get(current);
	        }
	        
	        if(sum * 2 == total){
	            return true;
	        }
	        if(sum > total/2 || index >= nums.length)
	            return false;
	        
	        boolean foundPartition =canPartition(nums,index+1,sum + nums[index],total,state) || canPartition(nums,index+1,sum,total,state);
	        state.put(current, foundPartition);
	        return foundPartition;  
	        }
}
