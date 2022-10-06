
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
        for(int i=0;i<matrix.length;i++){
            if(target == matrix[i][0])
            if(target < matrix[i][0])
            {ans=false;
            break;}
            int n= matrix[i].length-1;
            if(target <= matrix[i][n]){
                ans = findElementBinary(matrix[i], 0, n, target);
                break;
            }   
        }
        return ans;
    }
    private static boolean findElementBinary(int []arr, int low, int high, int target){
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target ){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
        
    }

}
