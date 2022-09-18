import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MyHashMap {

	Vector<List<Pair>> m;
	double size;
	public MyHashMap() {
		size=Math.pow(10, 6);
		m= new Vector<Integer>((int) size);
		for(int i=0;i<m.size()-1;i++)
			m.set(i, -1);
	}
	
	void put(int key, int value) {
		m.set(key, value);
	}
	
	int get(int key) {
		return m.get(key);
		
	}
	void remove(int key) {
		m.set(key, -1);
	}
}
