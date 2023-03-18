package programFirst;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> l = new LinkedHashMap<String,Integer>(); 
		
		l.put("Tamil", 90);
		l.put("English", 34);
		l.put("Maths", 23);
		l.put("Science", 56);
		l.put("Social", 34);
		l.put("Hindi", null);
		l.put("Computer", 90);
		l.put("Tamil", 90);   // Duplicate Entry
		l.put(null, 90);
		l.put("EVS", null);
		l.put(null, 87);
		
		
		System.out.println(l);
		
		
		Set<String> s1 = l.keySet();
		
		for(String k:s1)
		{
			System.out.println(k);
		}
		
		
		Collection<Integer> c = l.values();
		
		for(Integer k:c)
		{
			System.out.println(k);
		}
		
		
		Set<Entry<String, Integer>> s2 = l.entrySet();
		
		for(Entry<String,Integer> k : s2)
		{
			System.out.println(k.getValue() + "     " + k.getKey());
		}
		
		
		
	}

}
