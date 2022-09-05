import java.util.Arrays;

public class SortedSquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-4,-1,0,10,3,-5};
	
		int[] res = new int [nums.length];
        for(int i = 0 ; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        int start=0, end=nums.length-1;
        int index = res.length-1;

        while(start <= end){
            if(nums[start] > nums[end]){
                res[index] = nums[start];
                start++;
            }else{
                res[index] = nums[end];
                end--;
            }
            index--;
        }
        System.out.println(Arrays.toString(res));
	}
	

}
