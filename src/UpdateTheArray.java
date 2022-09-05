
import java.io.*;
    import java.util.*;
    public class UpdateTheArray {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                int N = Integer.parseInt(br.readLine().trim());
                String[] arr_A = br.readLine().split(" ");
                int[] A = new int[N];
                for(int i_A = 0; i_A < arr_A.length; i_A++)
                {
                	A[i_A] = Integer.parseInt(arr_A[i_A]);
                }
                int K = Integer.parseInt(br.readLine().trim());
                int out_ = minUpdates(N, A, K);
                wr.println(out_);
             }
             wr.close();
             br.close();
        }
        static int minUpdates(int N, int[] A, int K){
        	if(N%2==1)
        		return -1;
        	
        	int result=0;
        	int odd=0;
        	int even=0;
        	Set<Integer> hset= new HashSet<Integer>();
        	for(int i=0;i<N;i++) {
        		if(!hset.add(A[i]))
        			result++;
        		if(A[i]%2==0)
        			even++;
        		else
        			odd++;
        	}
        	if(odd!=even)
        		return -1;
        	
        	return result;
            
        }
    }

    
    
    
    
    
    
    
    
    /*
    static int minUpdates(int N, int[] A, int K){
            if(N%2>0) return -1;
            int evct=N/2,
            	frod=(K+1)/2,
            	frev=K/2,
            	duod=0,
            	duev=0;
            Set<Integer> s=new HashSet<>();
            for(int i=0;i<N;i++) {
            	boolean od=A[i]%2>0;
            	if(od) evct--;
            	if(s.add(A[i])) {
            		if(A[i]<=K)
    	        		if(od) frod--;
    	        		else frev--;
            	} else
            		if(od) duod++;
            		else duev++;
            }
            if(duod+evct>frod || duev-evct>frev) return -1;
            return evct>=0?Math.max(evct,duev)+duod:Math.max(-evct,duod)+duev;
        }  
   
     */