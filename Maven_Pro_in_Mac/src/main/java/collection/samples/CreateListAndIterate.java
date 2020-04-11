package collection.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CreateListAndIterate {

	
	public static void main(String[] args) {
		List<String> lt = new ArrayList<String>();
		
		lt.add("Veer");
		lt.add("Veer111");
		lt.add("Veer22");
		lt.add("Veer333");
		
		System.out.println("Original List : " + lt);
		
		ListIterator<String> it = lt.listIterator();
		while (it.hasNext()) {
//			it.remove();
			if("Veer".equalsIgnoreCase(it.previous())) {
				it.remove();
			}
		}
		System.out.println("Modified List : " + lt);
	}
}
