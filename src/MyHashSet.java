import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MyHashSet {
	List<List<Integer>> hashMapping;
	
	public MyHashSet(){
		
		hashMapping= new ArrayList<List<Integer>>();
		for(int i=0;i<hashMapping.size();i++)
        {
            hashMapping.add(new LinkedList<Integer>());
        }
	}
	
	public int hashFunction(int key) {
		return key % 11;
	}
	
	public boolean contains(int key) {
		int index= hashFunction(key);
		
		LinkedList<Integer> temp = (LinkedList<Integer>) hashMapping.get(index);
		if(temp.contains(key))
			return true;
		else 
			return false;
	}
	
	public void add(int key) {
		if(!contains(key)) {
			hashMapping.get(hashFunction(key)).add(key);
		}
	}
	public void remove(int key) {
		if(contains(key)) {
			hashMapping.get(hashFunction(key)).remove(key);
		}
	}
	
//	void add(key) 
//	bool contains(key) 
//	void remove(key)
//	
	
}
