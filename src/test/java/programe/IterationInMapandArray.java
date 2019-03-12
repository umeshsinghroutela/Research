package programe;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterationInMapandArray {

	@Test
	public static void test() {
		HashMap<Integer , String> hmap = new HashMap<Integer , String >();
		
		hmap.put(1, "Data1");
		hmap.put(2, "Data2");
		hmap.put(3, "Data3");
		hmap.put(4, "Data4");
		hmap.put(5, "Data5");

		Iterator<Entry<Integer, String>> it = hmap.entrySet().iterator();
		
		while (it.hasNext()) {
			
		}
	}
}
