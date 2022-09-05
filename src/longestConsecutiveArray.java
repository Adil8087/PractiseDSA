import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestConsecutiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,3,7,2,5,8,4,6,0,1};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
        int maxCount=1;
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1 ){
                count++;
            }
            
            else{
                maxCount=Math.max(count, maxCount);
                count=1;
            }
        }
        maxCount=Math.max(count, maxCount);
        System.out.println(maxCount);
//        List<List<Integer>> list = new ArrayList<List<Integer>>(1);
//        List<Integer> iList=new ArrayList<Integer>(1);
//        iList.add(22);
//        iList.add(23);
//        System.out.println(iList);
	}

}
