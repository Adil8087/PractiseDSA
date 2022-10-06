
public class CountingBits {
	
public int[] countBits(int num) {
        
        int[] ans= new int[num+1];
        
        for(int i=0; i<=num; i++){
            ans[i] = rec(i, ans);
        }
        return ans;
    }
    
    private static int rec(int num, int memo[]){
        if(num == 0){
            return 0;
        }
        
        if(num == 1){
            return 1;
        }
        if(memo[num] != 0) return memo[num];
        if((num & 1) == 0){   // num % 2 == 0
            memo[num]= rec(num/2, memo) ;
            return memo[num];
        }else
            memo[num]= 1 + rec(num/2, memo);
            return memo[num] ;
    }

}
