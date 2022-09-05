import java.util.ArrayList;
import java.util.Arrays;

public class minimumCoins {

	public static void main(String[] args) {
		int coins[]= {1,2,3};
		int amount=4;
		int n=3;
		
		int avCoins[][]= new int[n+1][amount+1];
		Arrays.fill(avCoins[0], 0);
		for(int i=1;i<n+1;i++) {
			for(int j=0;j<amount+1;j++) {
				if(j==0) {
					avCoins[i][j]=1;
				}else if(j < coins[i-1])
					avCoins[i][j]=avCoins[i-1][j];
				else {
					avCoins[i][j]=avCoins[i-1][j]+avCoins[i][j-coins[i-1]];
				}
			}
		}
		System.out.println(avCoins[n][amount]);	
	}

}
