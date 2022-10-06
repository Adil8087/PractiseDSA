import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	
	PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap= new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap= new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
    	if(maxHeap.isEmpty() || num < maxHeap.peek()) {
    		maxHeap.add(num);
    	}else
    		minHeap.add(num);
    	
    	if(minHeap.size() > maxHeap.size())
    		maxHeap.add(minHeap.poll());
    	if(maxHeap.size() > minHeap.size() + 1)
    		minHeap.add(maxHeap.poll());
    }
    
    public double findMedian() {
    	if(minHeap.size() == maxHeap.size())
    		return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
    	
		return maxHeap.peek();
        
    }

}
