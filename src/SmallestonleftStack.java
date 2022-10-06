import java.util.ArrayDeque;
import java.util.Deque;

public class SmallestonleftStack {

	
	public static void main(String[] args) {
//		int arr[]= {2,3,32,23,43,66,23,11,33};
		int arr[]= {2,3,4,5,1,6,3,5,2,6,1,8,2,9,9,3,7,32,23,43,66,23,11,33};
		         // -1 2 3 4 -1 5 2 4 1 5 -1 6 1 8 8 2 6 9 9 32 43 9 9 32
				//  -1 2 3 4 -1 1 1 3 1 2 -1 1 1 2 2 2 3 7 7 23 43 7 7 11 
		
		int ans[] = Smallestonleft(arr, arr.length);
		for (int i : ans) {
			System.out.print(i+" ");
		}
	}
public static int[] Smallestonleft (int arr[], int n) {
        
        
	
	
        Deque<Integer> stack = new ArrayDeque<>();
        int ans[] = new int[n];
        
        for(int i=0; i<n; i++){
            while( !stack.isEmpty() && stack.peek()>= arr[i]){
                stack.pop();
            }
        
            if(stack.isEmpty()){
            ans[i]=-1;
            }else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        
        return ans;
        
    }
}
