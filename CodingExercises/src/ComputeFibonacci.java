import java.util.*;

public class ComputeFibonacci {
	public static Map<Integer,Long> m = new HashMap<Integer,Long>();
	public static long computeFib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 1;
		long val1 = 0; 
		long val2 = 0;
		if(m.containsKey(n-1)) val1=m.get(n-1);
		else{
			m.put(n-1, computeFib(n-1));
			val1=m.get(n-1);
		}
		if(m.containsKey(n-2)) val2=m.get(n-2);
		else{
			m.put(n-2, computeFib(n-2));
			val2=m.get(n-2);
		}
		return val1+val2;
	}
	
	public static long computeFib_v2(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 1;
		int val = 2;
		long v1 = 1;
		long v2 = 1;
		while(val<n){
			long next = v1+v2;
			v1 = v2;
			v2 = next;
			val++;	
		}
		return v2;
	}

}
