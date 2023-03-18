package programFirst;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> h = new HashMap<String,Integer>();
		
		h.put("Tamil", 90);
		h.put("English", 34);
		h.put("Maths", 23);
		h.put("Science", 56);
		h.put("Social", 34);
		h.put("Hindi", null);
		h.put("Computer", 90);
		h.put("Tamil", 90);   // Duplicate Entry
		h.put(null, 90);
		h.put("EVS", null);
		h.put(null, 87);
		
		
		
		System.out.println(h);
		
		
		System.out.println(h.containsKey("Maths"));
		
		System.out.println(h.containsValue(34));
		
		System.out.println(h.get("Computer"));
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.remove("Maths", 23));
		
		System.out.println(h);
		
		System.out.println(h.size());
		
		
		System.out.println("Iterating using Enhanced for loop");
		
		Set<Entry<String,Integer>> s = h.entrySet();
		
	
		
		
		for(Map.Entry<String,Integer> k :s)
		{
			System.out.println(k.getKey() + "  " + k.getValue());
		}
		
		
		
		Set<String> s1 = h.keySet();
		
		for(String k : s1)
		{
			System.out.println(k);
		}
		
		
		Collection<Integer> c = h.values();
		
		for(Integer k : c)
		{
			System.out.println(k);
		}
		
	
		
		
		
	}
	
	

}
