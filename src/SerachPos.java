import java.util.Arrays;
import java.util.Collections;

public class SerachPos {

	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,6,7};
		int target =3;
//		System.out.println(searchInsert(nums, target));
		rotate(nums, target);
//		System.out.println(Arrays.toString(nums));
		
		String s = "Let's take LeetCode contest";
		char arr[]=s.toCharArray();
		Collections.reverse(Arrays.asList(arr));
		System.out.println(arr);
	}
	static int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;       // 1 3 5 6
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
	static void rotate(int[] nums, int k) {
        int n=nums.length;
       int rep[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(n-k<n){
                rep[i]=nums[n-k];
                k--;
            }else{
                rep[i]=nums[j];
                j++;
            }
            
        }
        for(int i=0;i<n;i++)
        	nums[i]=rep[i];
      
    }
}