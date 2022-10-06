
public class InfiniteBinarySearch {
	int findPos(int arr[], int key)
	{
	    int l = 0, h = 1;
	    int val = arr[0];
	 
	   
	    while (val < key)
	    {
	        l = h;        
	        h = 2*h;      
	        val = arr[h]; 
	    }
	 
	   
	    return findElementBinary(arr, l, h, key);
	}

	private static int findElementBinary(int []arr, int low, int high, int target){
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target ){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
        
    }
}
