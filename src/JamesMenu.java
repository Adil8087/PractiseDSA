import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JamesMenu {
	public static void main(String args[]) throws Exception {

		try (Scanner sc = new Scanner(System.in)) {
			int noOfMenu = sc.nextInt();
			int itemMenu = sc.nextInt();
			long menu[][] = new long[noOfMenu][itemMenu];
			long menuAvg[] = new long[noOfMenu];
			for (int i = 0; i < noOfMenu; i++) {
				long sum = 0;
				for (int j = 0; j < itemMenu; j++) {
					menu[i][j] = sc.nextInt();
					sum += menu[i][j];
				}
				menuAvg[i] = (sum / noOfMenu);
			}

			
			long max = Integer.MIN_VALUE;
			int maxMenu = Integer.MIN_VALUE;
			int maxPrice[] = new int[noOfMenu];

			for (int j = 0; j < itemMenu; j++) {
				for (int i = 0; i < noOfMenu; i++) {
					if (menu[i][j] > max) {
						max = menu[i][j];
						maxMenu = i;
					}

				}
				maxPrice[maxMenu]++;
				max=Integer.MIN_VALUE;
			}
			
			int indexOfMax=0;
			for(int i=1;i<maxPrice.length;i++) {
				if(maxPrice[i]>maxPrice[indexOfMax])
					indexOfMax=i;
				else if(maxPrice[i]==maxPrice[indexOfMax]) {
					if(menuAvg[i]<menuAvg[indexOfMax])
						indexOfMax=i;
				}
			}
			System.out.println(indexOfMax+1);
			
			ArrayList<Integer> list= new ArrayList<Integer>();
			list.se


		}
	}

	public static int solve(int numMenus, int numItems, long[][] menus) {

		int bestMenu = 0;

		long[] bestPrices = new long[numItems];

		int[] countBestForMenus = new int[numMenus];

		for (int i = 0; i < numItems; i++) {

			long max = menus[0][i];

			for (int j = 0; j < numMenus; j++) {

				max = Math.max(max, menus[j][i]);

			}

			bestPrices[i] = max;

		}

		int maxBestCount = 0;

		for (int i = 0; i < numMenus; i++) {

			for (int j = 0; j < numItems; j++) {

				if (menus[i][j] == bestPrices[j]) {

					countBestForMenus[i]++;

				}

			}

			maxBestCount = Math.max(maxBestCount, countBestForMenus[i]);

		}

		long[] avgMenus = new long[numMenus];

		for (int i = 0; i < numMenus; i++) {

			long avg = 0;

			for (int j = 0; j < numItems; j++) {

				avg += menus[i][j];

			}

			avg = avg / numItems;

			avgMenus[i] = avg;

		}

		long maxAvg = 0;

		for (int i = 0; i < numMenus; i++) {

			if (countBestForMenus[i] == maxBestCount) {

				if (avgMenus[i] > maxAvg) {

					bestMenu = i + 1;

					maxAvg = avgMenus[i];

				}

			}

		}

		return bestMenu;

	}
}
