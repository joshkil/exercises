import java.util.*;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}
	
	public static final int MAX_CACHE = 1000;
	public static  Map<Integer, Record> map = new HashMap<Integer, Record>();
	public static  Record head = null;
	public static  Record tail = null;
	public static int hitCount = 0;
	public static int fetchCount = 0;
	
	public static Record fetch(int i){
		Record val = null;
		fetchCount++;
		val = map.get(i);
		
		if(val != null){
			hitCount++;
			
			// adjust position in list
			Record currentHead = head;
			Record currentNext = val.next;
			Record currentPrev = val.prev;
			
			// adjust tail
			if(tail == null){
				tail = val;
			}else if(tail == val && val.prev != null){
				tail = val.prev;
			}
			
			// move val to head
			if (head != val) {
				head = val;
				val.prev = null;
				val.next = currentHead;
			}
			
			// repair gap
			if(currentPrev != null) currentPrev.next = currentNext;
			if(currentNext != null) currentNext.prev = currentPrev;
			
		}else{
			//create record
			val = new Record(i);
			
			// check map size and evict LRU record
			if(map.size()>MAX_CACHE){
				map.remove(tail.id);
				tail = tail.prev;
				tail.next = null;
			}
			
			// add record to map and add to front of list
			map.put(i, val);
			val.next = head;
			head = val;
			
			// adjust tail if needed
			if(tail == null){
				tail = val;
			}
		}
		
		return val;
	}
	
	private static class Record{
		public Record(int id){
			this.id = id;
			this.prev=null;
			this.next=null;
		}
		public int id;
		public Record prev;
		public Record next;
	}

}
