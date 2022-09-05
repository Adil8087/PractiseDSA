import java.util.ArrayList;

public class MaxSubArray {

	public static void main(String[] args) {
		int arr[]= {26,32,34,55,21,31,32,43};
		ArrayList<Integer> max_of_subarrays = max_of_subarrays(arr, 8, 3);
//		System.out.println(max_of_subarrays.toString());
		String abc="Hello";
		System.out.println(abc.length());
		System.out.println(abc.charAt(0)-'a');
	}
	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
 {
   
        
		ArrayList<Integer> list= new ArrayList<Integer>();
        
       for(int j=0;j<=n-k;j++){
          int maxM= Integer.MIN_VALUE; 
          int i=j;
        for(;i<j+k;i++){
            
            maxM=Math.max(maxM, arr[i]);
        }
        list.add(maxM);
            while(arr[j]!=maxM && i<n){
                maxM=Math.max(maxM, arr[i]);
                list.add(maxM);
                i++;
                j++;
            }
        }
       
        
        
        return list;
    }

}
