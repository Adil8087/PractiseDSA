import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneLeft {
	public static void main(String[] args) {
		int arr[] = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(arr));
		
	}
	public static int lastStoneWeight(int[] stones) {
		
		PriorityQueue<Integer> maxHeap= new PriorityQueue<Integer>(Comparator.reverseOrder());
		int n= stones.length;
		for(int i=0;i<stones.length;i++) {
			maxHeap.add(stones[i]);
		}
		int first=0;
		int second=0;
		
		while(n>1) {
			first=maxHeap.poll();
			second=maxHeap.poll();
			
			n -=2;
			if(first - second >0) {
				maxHeap.add(first-second);
				n+=1;
			}
		}
		
		if(maxHeap.isEmpty())
			return 0;
		
		return maxHeap.peek();

	}
}
