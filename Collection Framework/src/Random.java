import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Random{
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedlist=new LinkedList<Integer>();
		
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList",linkedlist);
		
		
	}

	private static void doTimings(String type, List<Integer> list) {
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		for(int i=0;i<1E5;i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken" +(end-start) + "ms for" + type);
		
	}
}