import java.util.Scanner;

public class Divisible2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt(); 

	        int[] A = new int[N];

	        int j = 0;                

	        int l = 0;

	        int toggle = 1;

	        for (int i = 0; i < N; i++) {

	            A[i] = sc.nextInt();

	            float k = i + 1;    

	            if (k / N <= 0.5) {               

	                while (A[i] > 0) {

	                    j = A[i] % 10;

	                    A[i] = A[i] / 10;

	                }

	                toggle++;                 
	                if (toggle % 2 == 0) { 
	                    l = l + j;

	                }else {

	                    l = l - j;

	                }

	            } else {              

	                toggle++;

	                j = A[i] % 10;

	                if (toggle % 2 == 0) {           //Similarly, here I'm toggling the addition and subtraction of digits that I am taking from last digits of all numbers in 2nd part of array.

	                    l = l + j;

	                }else {

	                    l = l - j;

	                }

	            }

	        }

	        sc.close();

	        if (l % 11 == 0)                        
	            System.out.println("OUI");

	        else

	            System.out.println("NON");


	 

	    }
	
}

