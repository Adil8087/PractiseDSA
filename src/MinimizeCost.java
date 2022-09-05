import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class MinimizeCost {


		public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        
	         int n = Integer.parseInt(br.readLine().trim());
	         long k = Long.parseLong(br.readLine().trim());
	         String[] arr_arr = br.readLine().split(" ");
	         int[] arr = new int[n];
	         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
	         {
	         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
	         }

	         long out_ = Solve(k, arr);
	         System.out.println(out_);

	         wr.close();
	         br.close();
	    }
	    static long Solve(long k, int[] arr){
	    	int[] arrT = new int[arr.length];
	    	Arrays.fill(arrT, 0);
	    	return k;
			
	    
	    }

}
