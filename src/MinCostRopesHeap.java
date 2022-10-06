import java.util.PriorityQueue;

 public class MinCostRopesHeap {

	long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> que= new PriorityQueue<>();
        for(int i=0;i<n;i++){
            que.add(arr[i]);
        }
        long finalCost=0;
        while(que.size()>1){
            long first= que.poll();
            long second= que.poll();
            long sum= first + second;
            finalCost += sum;
            
            que.add(sum);
        }
        
        return finalCost;
    }
}
