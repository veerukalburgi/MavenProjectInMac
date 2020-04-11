package Fail.fast.safe;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast {
	
	public static void demoFailFast(){

		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("1", "abc1");
		ht.put("2", "abc2");
		ht.put("3", "abc3");
		ht.put("4", "abc4");
		ht.put("5", "abc5");
		
		Iterator<String> it = ht.keySet().iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			ht.put("6", "abc6");
		}
	
	}
	public static void demoFailSafe(){
		
		
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		
		concurrentHashMap.put("1", "abc1");
		concurrentHashMap.put("2", "abc2");
		concurrentHashMap.put("3", "abc3");
		concurrentHashMap.put("4", "abc4");
		concurrentHashMap.put("5", "abc5");
		
		Iterator<String> it = concurrentHashMap.keySet().iterator();
		
		while (it.hasNext()) {
			System.out.println(concurrentHashMap.get(it.next()));
			concurrentHashMap.put("6", "abc6");
		}
		
	}

	public static void main(String args[]) {
		demoFailSafe();
//		demoFailFast();
	}
}
