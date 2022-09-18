import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MergeIntervals {
	
public int[][] merge(int[][] intervals) {
    
	ArrayList<int[]> list= new ArrayList<int[]>();
	if(intervals.length ==0 || intervals == null)
		return new int[0][0];
	
	Arrays.sort(intervals,(a,b)->a[0]-b[0]);
	 
	int start=intervals[0][0];
	int end=intervals[0][1];
	
	for (int[] i : intervals) {
		if(i[1]<=end) {
			
			end= Math.max(end, i[1]);
			
		}
		else {
			list.add(new int[] {start, end});
			start= i[0];
			end= i[1];
		}
	}
	list.add(new int[] {start, end});
	list.toArray();
	
	return list.toArray(new int[0][]);
    }

}
