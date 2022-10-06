import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubArray {
	public static int lenOfLongSubarr (int arr[], int n, int k) {
        // if(nums.length == 1)
        //     return 1;
        // HashMap<Integer,Integer> map= new HashMap<>();
        // int max=0;
        // int low=0;
        // int high=0;
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
            
            
        //     if(sum < k){
        //         map.put(i, nums[i]);
        //     }
        //     else if(sum == k){
        //         map.put(i, nums[i]);
        //         max= Math.max(max, map.size());
        //         high=i;
        //     }else{
        //         high=i;
        //         while(sum >= k && low < high){
        //             if(sum == k){
        //               max= Math.max(max, map.size());
        //                 break;
        //             }
        //             sum = sum - nums[low];
        //             map.remove(low);
        //             low++;
                    
        //         }
        //     }
        // }
        
        // return max;
        
        int maxLength=0;

        int start=0,last=0,currSum=0;

        

        for(int i=0;i<n;i++){

            currSum += arr[i];

            

            if(currSum>=k){

                last=i;

                

                while(currSum>k && start<last){

                    currSum -= arr[start];

                    start++;

                }

            }

            

            if(currSum==k){

                maxLength = Math.max(maxLength, last-start+1);

            }

        }

        

        return maxLength;

    }
	/////////////////// Leetcode

	public int subarraySum(int[] nums, int k) {
//      if(nums.length == 1){
//          if(nums[0] == k)
//              return 1;
//          else
//              return 0;
//      }
         
//      HashMap<Integer,Integer> map= new HashMap<>();
//      int count=0;
//      int low=0;
//      int sum=0;
//      for(int i=0;i<nums.length;i++){
//          sum+=nums[i];
         
         
//          if(sum < k){
//              map.put(i, nums[i]);
//          }
//          else if(sum == k){
//              map.put(i, nums[i]);
//              count++;
//          }else{
//              while(sum >= k ){
//                  if(sum == k){
//                     count++;
//                      break;
//                  }
//                  sum = sum - nums[low];
//                  map.remove(low);
//                  low++;
                 
//              }
//          }
//      }
     
//      return count;
     
     Map<Integer, Integer> map = new HashMap<>();
     map.put(0,1);
     int counter = 0;
     int currSum = 0;
     for (int i = 0; i < nums.length; i++) {
         currSum += nums[i];
         if (map.containsKey(currSum - k)){
             counter += map.get(currSum - k);
         }
         map.put(currSum, map.getOrDefault(currSum, 0)+1);
     }
     
     return counter;
     
 }

}
