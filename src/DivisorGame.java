
public class DivisorGame {
	public boolean divisorGame(int n) {
        boolean DP[] = new boolean[1001];
        if(n==1)
            return false;
        if(DP[n]) return DP[n];
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(!divisorGame(n-i))return DP[n]= true;
                if(i!=1 && !divisorGame(n-(n/i)))return DP[n]= true;
            }
        }
        
        return DP[n]= false;
        //return n%2==0;
    }
}
