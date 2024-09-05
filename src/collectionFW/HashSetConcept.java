package collectionFW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSetConcept hs = new HashSetConcept();
		hs.concept6();
	}
	
	
	public void concep1() {
		
		HashSet<String> se = new HashSet<>();
		
		se.add("1234");
		se.add("1234");
		
		Iterator<String> itr = se.iterator();
		
		while(itr.hasNext()) {
			
			String str = itr.next();
			
			if(str.equals("1234")) {
				System.out.println("data is present");
			
			}else {
				System.out.println("data is not present");
			}
			
		}
		
	}
	
	public void concept3() {
		int[] arr = { 1, 2, 2, 3, 4, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);//1 2 3 4 5
	}
	
	
	public void concept6() {
		
		Map<Integer, String> map = new TreeMap();
		
		//Key value pair
		
		/**
		 * 1 Aman
		 * 
		 * 2 Arpit
		 * 
		 * 3 Aman
		 * 
		 * 4 Aman
		 * 
		 */
		
		map.put(1, "Aman");
		map.put(2, "Rrpit");
		map.put(5, "Qman");
		map.put(3, "Aman");
		
		
		
		System.out.println(map);
		
		
		
	}

}
