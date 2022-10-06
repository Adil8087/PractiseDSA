
public class SearchInSortedRotatedArray {
	public static void main(String[] args) {
		int num[]= {4,5,6,7,0,1,2};
		System.out.println(search(num, 3));
	}

	public static int search(int[] nums, int key) {
        int low=0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid= (low+high)/2;
            if(nums[mid]== key)
                return mid;
            
            if(high-low ==1) {
            	if(nums[mid+1]== key)
                    return mid+1;
            }
            
            if(nums[low] < nums[mid]){
                if(key < nums[mid] && key >= nums[low]){
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }
            }else{
                if(key > nums[mid] && key <= nums[high])
                    low= mid+1;
                else
                    high= mid-1;
                
            }
        }
        return -1;
        
        
    }
}
