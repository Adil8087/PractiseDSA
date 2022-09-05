
public class matrixTranspose {

	public static void main(String[] args) {
		int[][] arr= new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=i+1;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int[][] tarr= new int[4] [4];
		for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){      	
            	tarr[j][i]=arr[i][j];
                
            }
            System.out.println();
		}
		arr=tarr;
		for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
		}
	}

}
