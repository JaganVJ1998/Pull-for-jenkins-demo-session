package programFirst;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> t = new TreeMap<String, Integer>();
		
		
		t.put("Tamil", 90);
		t.put("English", 34);
		t.put("Maths", 23);
		t.put("Science", 56);
		t.put("Social", 34);
		t.put("Hindi", null);
		t.put("Computer", 90);
		t.put("Tamil", 90);   // Duplicate Entry
		//t.put(null, 90);
		t.put("EVS", null);
	//	t.put(null, 87);
		
		
		System.out.println(t);
		
		
		Set<String> s1 = t.keySet();
		
		for(String k:s1)
		{
			System.out.println(k);
		}
		
		
		Collection<Integer> c = t.values();
		
		for(Integer k :c)
		{
			System.out.println(k);
		}
		
		
		Set<Entry<String,Integer>> s2 = t.entrySet();
		
		for(Entry<String,Integer> k : s2)
		{
			System.out.println(k.getKey() + "  " + k.getValue());
		}
		
		
		
	}
	
	

}
